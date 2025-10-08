import java.util.HashMap;

class PreIn {

  public TreeNode buildTree(int[] preOrder, int[] inOrder) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < inOrder.length; i++) {
      map.put(inOrder[i], i);
    }

    int[] index = {0};
    return helper(preOrder, inOrder, 0, inOrder.length - 1, map, index);
  }

  public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, 
                         HashMap<Integer, Integer> map, int[] index) {
    if (left > right) {
      return null;
    }

    int current = preOrder[index[0]];
    index[0]++;

    TreeNode node = new TreeNode(current);

    if (left == right) {
      return node;
    }

    int inIndex = map.get(current);

    node.left = helper(preOrder, inOrder, left, inIndex - 1, map, index);
    node.right = helper(preOrder, inOrder, inIndex + 1, right, map, index);

    return node;
  }

  public static void main(String[] args) {
      PreIn obj = new PreIn();
      int[] preorder = {3,9,20,15,7};
      int[] inorder = {9,3,15,20,7};
      TreeNode root = obj.buildTree(preorder, inorder);
      System.out.println("Root of tree: " + root.val);
  }
}
