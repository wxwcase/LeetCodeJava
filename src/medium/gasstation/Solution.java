package medium.gasstation;

public class Solution {

  /**
   * There are N gas stations along a circular route, 
   * where the amount of gas at station i is gas[i].
   * You have a car with an unlimited gas tank and it 
   * costs cost[i] of gas to travel from station i to its 
   * next station (i+1). You begin the journey with an empty tank at one of the gas stations.
   * @param gas gas array
   * @param cost cost array
   * @return the starting index or -1 if not possible to travel around.
   */
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int result = -1;
    int[] grow = new int[gas.length];
    int count;
    int start = 0;
    int remain;
    int tried = 0;

    for (int i = 0; i < gas.length; i++) {
      grow[i] = gas[i] - cost[i];
    }

    while (tried < gas.length) {
      // find start point which is not negative to travel to the next station
      remain = 0;
      while (grow[start] < 0 && tried < gas.length) {
        start = (start + 1) % gas.length;
        tried++;
      }
      tried++;
      count = 0;
      while (remain >= 0 && count < gas.length) {
        remain += grow[start];
        start = (start + 1) % gas.length;
        count++;
      }
      if (count == gas.length && remain >= 0) {
        result = start;
        break;
      }
    }
    return result;
  }
}
