public class DiameterOfBT {

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int hl = height(root.left);
		int hr = height(root.right);

		return Math.max(hl, hr) + 1;
	}

	public static int diameter1(BinaryTreeNode<Integer> root) {
		// base case
		if (root == null) {
			return 0;
		}

		// maximum distance between two nodes of left subtree
		int ld = diameter1(root.left);

		// maximum distance between two nodes of left subtree
		int rd = diameter1(root.right);

		// maximum distance between two nodes of left & right subtree
		int f1 = height(root.left) + height(root.right) + 2;

		// comparing all three factor, which one is larger is our answer
		int dia = Math.max(f1, Math.max(ld, rd));
		return dia;
	}

	static class DiaPair {
		int ht;
		int dia;
	}

	public static DiaPair diameter2(BinaryTreeNode<Integer> root) {
		if (root == null) {
			DiaPair bp = new DiaPair();
			bp.ht = -1;
			bp.dia = 0;
			return bp;
		}
		DiaPair lp = diameter2(root.left);
		DiaPair rp = diameter2(root.right);

		DiaPair mp = new DiaPair();
		mp.ht = Math.max(lp.ht, rp.ht) + 1;
		mp.dia = Math.max(lp.ht + rp.ht + 2, Math.max(lp.dia, rp.dia));
		return mp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
