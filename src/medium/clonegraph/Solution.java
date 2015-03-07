package medium.clonegraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.datastruct.UndirectedGraphNode;

public class Solution {
  
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    // create first node
    if (node == null) {
      return null;
    }
    
    UndirectedGraphNode result = new UndirectedGraphNode(node.label);
    List<UndirectedGraphNode> rootNeighbors = node.neighbors;
    List<UndirectedGraphNode> resultNeighbors = new ArrayList<>();
    result.neighbors = resultNeighbors;
    
    if (rootNeighbors.size() == 1) {
      return result;
    }
    
    
    for(UndirectedGraphNode neighbor : rootNeighbors) {
      UndirectedGraphNode n = cloneGraph(neighbor);
      resultNeighbors.add(n);
    }
    return result;
  }
}
