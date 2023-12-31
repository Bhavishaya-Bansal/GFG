public class Boundary {
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }

        ans.add(node.data);
        traverseLeft(node.left, ans);
        traverseLeaf(node.left, ans);
        traverseLeaf(node.right, ans);
        traverseRight(node.right, ans);

        return ans;
    }

    private void traverseLeft(Node node, ArrayList<Integer> ans) {
        if ((node == null) || (node.left == null && node.right == null)) {
            return;
        }

        ans.add(node.data);

        if (node.left != null) {
            traverseLeft(node.left, ans);
        } else {
            traverseLeft(node.right, ans);
        }

    }

    private void traverseLeaf(Node node, ArrayList<Integer> ans) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            ans.add(node.data);
            return;
        }

        traverseLeaf(node.left, ans);
        traverseLeaf(node.right, ans);
    }

    private void traverseRight(Node node, ArrayList<Integer> ans) {
        if ((node == null) || (node.left == null && node.right == null)) {
            return;
        }

        if (node.right != null) {
            traverseRight(node.right, ans);
        } else {
            traverseRight(node.left, ans);
        }
        
        ans.add(node.data);
    }
}
