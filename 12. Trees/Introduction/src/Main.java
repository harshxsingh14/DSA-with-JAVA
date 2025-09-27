
public class Main {
  public static void main(String[] args) {
    BST tree = new BST();
    int[] nums = { 52, 21, 171, 13, 44, 65, 95, 78, 83, 90 };
    tree.populate(nums);
    tree.display();
  }
}