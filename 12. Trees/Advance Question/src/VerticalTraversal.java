import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class VerticalTraversal {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // TreeMap to automatically sort by column
        Map<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode node = p.node;
            int col = p.col;
            int row = p.row;

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(new int[]{row, node.val});

            if (node.left != null) queue.offer(new Pair(node.left, col - 1, row + 1));
            if (node.right != null) queue.offer(new Pair(node.right, col + 1, row + 1));
        }

        // Sort each column by row, then by value
        for (List<int[]> list : map.values()) {
            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0]) return a[1] - b[1];
                return a[0] - b[0];
            });

            List<Integer> colList = new ArrayList<>();
            for (int[] arr : list) colList.add(arr[1]);
            ans.add(colList);
        }

        return ans;
    }

    // Helper class to store node with column and row info
    static class Pair {
        TreeNode node;
        int col;
        int row;

        Pair(TreeNode node, int col, int row) {
            this.node = node;
            this.col = col;
            this.row = row;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        VerticalTraversal vt = new VerticalTraversal();
        List<List<Integer>> result = vt.verticalTraversal(root);
        System.out.println(result); 
    }
}
