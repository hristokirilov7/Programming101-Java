package problem03;

public class BinarySearchTree {
	public class Node {
		Integer info;
		Node left;
		Node right;
		Node parent;

		public Node(Integer info, Node parent) {
			this.info = info;
			this.parent = parent;
			right = null;
			left = null;
		}

	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(Integer info) {
		if (root == null) {
			root = new Node(info, null);
		}
		insertHelper(info, root);
	}

	private void insertHelper(Integer info, Node root) {
		if (root.info > info) {
			if (root.left == null) {
				root.left = new Node(info, root);
				return;
			}
			insertHelper(info, root.left);
		} else {
			if (root.right == null) {
				root.right = new Node(info, root);
				return;
			}
			insertHelper(info, root.right);
		}
	}

	public boolean delete(Integer info) {
		if (root == null)
			return false;
		return deleteFinder(info, root);
	}

	private boolean deleteFinder(Integer info, Node root) {
		if (root.info == info) {
			deleteNode(root);
			return true;
		}
		if (root.info > info) {
			return deleteFinder(info, root.left);
		}
		if (root.info < info) {
			return deleteFinder(info, root.right);
		}
		return false;
	}

	private void deleteNode(Node root) {
		if (root.parent == null) {
			this.root = null;
		} else if (root.left == null && root.right == null) {
			Node parentNode = root.parent;
			if (parentNode.left == root) {
				parentNode.left = null;
			} else {
				parentNode.right = null;
			}
		} else if (root.left == null) {
			Node parentNode = root.parent;
			if (parentNode.left == root) {
				parentNode.left = root.right;
			} else {
				parentNode.right = root.right;
			}
		} else if (root.right == null) {
			Node parentNode = root.parent;
			if (parentNode.left == root) {
				parentNode.left = root.left;
			} else {
				parentNode.right = root.left;
			}
		} else {
			Node nodeToReplaceWith = root.right;
			while (nodeToReplaceWith.left != null) {
				nodeToReplaceWith = nodeToReplaceWith.left;
			}
			Node parentNode = nodeToReplaceWith.parent;
			Node tmp = null;
			if (nodeToReplaceWith.right != null)
				tmp = nodeToReplaceWith.right;
			if (parentNode.left == nodeToReplaceWith)
				parentNode.left = tmp;
			else
				parentNode.right = tmp;
			parentNode = root.parent;
			if (parentNode.left == root) {
				parentNode.left = nodeToReplaceWith;
			} else {
				parentNode.right = nodeToReplaceWith;
			}
			nodeToReplaceWith.left = root.left;
			nodeToReplaceWith.right = root.right;
		}
	}

	public Node search(Integer info) {
		if (root == null)
			return null;
		return searchHelper(info, root);
	}

	private Node searchHelper(Integer info, Node root) {
		if (root == null) {
			return null;
		}
		if (root.info == info) {
			return root;
		}
		if (root.info > info) {
			return searchHelper(info, root.left);
		} else {
			return searchHelper(info, root.right);
		}
	}

}
