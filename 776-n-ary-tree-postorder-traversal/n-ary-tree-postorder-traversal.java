/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> l1 = new ArrayList<>();
        postorder(root,l1);
        return l1;
    }
    private void postorder(Node root,List<Integer> l1)
    {
      if(root==null)
      {
        return;
      }
      for(Node child: root.children)
      {
        
        postorder(child , l1);
      }
      l1.add(root.val);
    }
}