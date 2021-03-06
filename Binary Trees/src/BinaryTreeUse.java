import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
		if (isRoot) {
			System.out.println("Enter root data : ");
		} else {
			if (isLeft) {
				System.out.println("Enter left child of " + parentData);
			} else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		Scanner sc = new Scanner(System.in);

		int rootData = sc.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	public static BinaryTreeNode<Integer> takeTreeInput() {
		System.out.println("Enter root data : ");
		Scanner sc = new Scanner(System.in);

		int rootData = sc.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();

		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTreeNoob(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printTreeNoob(root.left);
		printTreeNoob(root.right);
	}

	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int getSum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNode = getSum(root.left);
		int rightNode = getSum(root.right);
		return (root.data + leftNode + rightNode);
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}

		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int heightLeft = height(root.left);
		int heightRight = height(root.right);

		return 1 + Math.max(heightLeft, heightRight);
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		int leavesLeft = numLeaves(root.left);
		int leavesRight = numLeaves(root.right);

		return leavesLeft + leavesRight;
	}

	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return;
		}

		if (k == 0) {
			System.out.print(root.data + " ");
			return;
		}
		printAtDepthK(root.left, k - 1);
		printAtDepthK(root.right, k - 1);
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}

		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);

		BinaryTreeNode<Integer> tempLeft = root.left;
		root.left = root.right;
		root.right = tempLeft;
	}

	public static boolean isBalancedBasic(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isLeftBalanced = isBalancedBasic(root.left);
		boolean isRightBalanced = isBalancedBasic(root.right);

		return isLeftBalanced && isRightBalanced;
	}

	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = -1;
			ans.isBalanced = true;
			return ans;
		}

		BalancedTreeReturn lp = isBalancedBetter(root.left);
		BalancedTreeReturn rp = isBalancedBetter(root.right);

		BalancedTreeReturn mp = new BalancedTreeReturn();
		mp.height = Math.max(lp.height, rp.height) + 1;
		mp.isBalanced = lp.isBalanced && rp.isBalanced && Math.abs(lp.height - rp.height) <= 1;

		return mp;
	}

	public static BinaryTreeNode<Integer> buildTreePreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn,
			int eiIn) {
		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			rootIndex = i;
			break;
		}

		// assuming root is present in InOrder
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;
		int eiInLeft = rootIndex - 1;
		int siInRight = rootIndex + 1;

		int leftSubtreeLength = eiInLeft - siInLeft + 1;

		int eiPreLeft = siPreLeft + leftSubtreeLength - 1;
		int siPreRight = eiPreLeft + 1;

		BinaryTreeNode<Integer> left = buildTreePreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> right = buildTreePreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		root.left = left;
		root.right = right;
		return root;
	}

	public static BinaryTreeNode<Integer> builldTreePreIn(int pre[], int in[]) {

		BinaryTreeNode<Integer> root = buildTreePreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("Number of Nodes : " + numNodes(root));
		System.out.println("Largest Node : " + largest(root));
		System.out.println("Height of Tree : " + height(root));
		System.out.println("Number of Leaves : " + numLeaves(root));

		// System.out.println("print at depth k = 2 : ");
		// printAtDepthK(root, 2);
		// System.out.println();
		// BinaryTreeNode<Integer> newRoot = removeLeaves(root);
		// printTreeDetailed(newRoot);
		// mirrorBinaryTree(root);
		// printTreeDetailed(root);

		System.out.println("isBalanced : " + isBalancedBasic(root));

		/*
		 * BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);x
		 * 
		 * BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		 * BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3); root.left
		 * = rootLeft; root.right = rootRight;
		 * 
		 * BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
		 * BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
		 * rootLeft.right = twoRight; rootRight.left = threeLeft;
		 */
	}
}
