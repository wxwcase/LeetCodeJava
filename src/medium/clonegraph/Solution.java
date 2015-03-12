package medium.clonegraph;

import java.util.Map;
import java.util.HashMap;

import common.datastruct.UndirectedGraphNode;

/**
 * @author wxwcase
 * Algorithm:
 * **********************************
 * visit(Node node) {
 *   for(Node node : neighbors) { 
 *     visit(node);
 *   }
 *   process(node);
 * }
 * **********************************
 */
public class Solution {
  
  Map<Integer, UndirectedGraphNode> map = new HashMap<>();

  /**
   * Clone an undirected graph.
   * @param node root node
   * @return the cloned graph root node
   */
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    if (node == null) {
      return null;
    }
    UndirectedGraphNode localnode = new UndirectedGraphNode(node.label);
    map.put(node.label, localnode);
    for (UndirectedGraphNode neighbor : node.neighbors) {
      UndirectedGraphNode cur;
      if (!map.containsKey(neighbor.label)) {
        cur = cloneGraph(neighbor);
      } else {
        cur = map.get(neighbor.label);
      }
      localnode.neighbors.add(cur);
    }
    return localnode;
  }
}
