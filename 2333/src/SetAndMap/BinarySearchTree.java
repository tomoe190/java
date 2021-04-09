package SetAndMap;

class BinarySearchNode {
    public int key;
    public int value;
    public BinarySearchNode left;
    public BinarySearchNode right;

    public BinarySearchNode(int key,int value) {
        this.key = key;
        this.value = value;
    }
}

public class BinarySearchTree {
    private BinarySearchNode root = null;
    
    // 根据 key 来找 value
    public Integer get(int key) {
        BinarySearchNode cur = root;
        while (cur != null) {
            if (cur.key < key) {
                cur = cur.right;
            } else if (cur.key > key) {
                cur = cur.left;
            } else {
                return cur.value;
            }
        }
        return null;
    }

    // 插入新节点
    public void put(int key,int value) {
        if (root == null) {
            root = new BinarySearchNode(key,value);
        }
        BinarySearchNode cur = root;
        BinarySearchNode parent = null;
        while (cur != null) {
            if (cur.key < key) {
                parent = cur;
                cur = cur.right;
            } else if (cur.key > key) {
                parent = cur;
                cur = cur.left;
            } else {
                cur.value = value;
                return ;
            }
        }
        BinarySearchNode newNode = new BinarySearchNode(key,value);
        if (parent.key > newNode.key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // 删除节点
    public void remove(int key) {
        BinarySearchNode cur = root;
        BinarySearchNode parent = null;
        while (cur != null) {
            if (cur.key < key) {
                parent = cur;
                cur = cur.right;
            } else if (cur.value > key) {
                parent = cur;
                cur = cur.left;
            } else {
                removeNode(parent,cur);
            }
        }
    }

    private void removeNode (BinarySearchNode parent,BinarySearchNode cur) {
        // 1、要删除的节点没有左子树
        if (cur.left == null) {
            if (cur == root) {
                // 1.1 要删除节点为根节点
                root = cur.right;
            } else if (cur == parent.right) {
                // 1.2 要删除节点是其父节点的右子树
                parent.right = cur.right;
            } else if (cur == parent.left) {
                // 1.3 要删除节点是其父节点的左子树
                parent.left = cur.right;
            }
        // 2、要删除的节点没有右子树
        } else if(cur.right == null){
            if (cur == root) {
                // 2.1 要删除节点是根节点
                root = cur.left;
            } else if (cur == parent.right) {
                // 2.2 要删除节点是其父节点的右子树
                parent.right = cur.left;
            } else if (cur == parent.left) {
                // 2.3 要删除节点是其父节点的左子树
                parent.left = cur.left;
            }
        // 3、要删除的节点左右子树都有
        } else {
            // 在右子树中找到最小值
            BinarySearchNode goat = cur.right;
            BinarySearchNode goatParent = cur;
            while (goat.left != null) {
                goat = goat.left;
            }
            cur.key = goat.key;
            cur.value = goat.value;
            if (goat == goatParent.left) {
                goatParent.left = goat.right;
            } else if (goat == goatParent.right) {
                goatParent.right = goat.right;
            }
        }
    }
}
