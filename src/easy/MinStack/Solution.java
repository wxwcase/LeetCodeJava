package easy.MinStack;

import java.util.LinkedList;

public class Solution {
	
	LinkedList<Integer> minStack = new LinkedList<>();
	LinkedList<Integer> pair = new LinkedList<>();

	/**
	 * Design a stack that supports push, pop, top, and 
	 * retrieving the minimum element in constant time.
	 * @param x
	 */
	public void push(int x) {
		minStack.push(x);
		System.out.println("minStack pushing; " + x);
		if(pair.isEmpty() || x <= pair.peek()) {
			System.out.println("pair pushing: " + x);
			pair.push(x);
		}
	}
	
	public void pop() {
		if(pair.peek().equals(minStack.peek())) {
			pair.pop();
		}
		minStack.pop();
	}
	
	public int top() {
		return minStack.peek();
	}
	
	public int getMin() {
		return pair.peek();
	}
}

class Solution2 {
	// Solution with one stack
	LinkedList<Integer> stack = new LinkedList<>();
	int min = Integer.MAX_VALUE;
	public void push(int x) {
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}
	public void pop() {
		if(stack.peek() == min) {
			stack.pop();
			min = stack.peek();
			stack.pop();
		} else {
			stack.pop();
		}
		if(stack.isEmpty()) {
			min = Integer.MAX_VALUE;
		}
	}
	public int top() {
		return stack.peek();
	}
	public int getMin() {
		return min;
	}
}
