package Container;
import java.util.*;
public class TestErcha {
    public static void main(String[] args) {
//            List<Integer> ints = new ArrayList<> (Arrays.asList (7, 3, 5, 7, 9, 1, 3, 0));
//            Tree tree = new Tree ();
//            ints.forEach (tree::add);
////            tree.print ();
        Tree tree = new Tree ();
        tree.add (3);
        tree.add (6);
        tree.add (8);
        tree.add (8);
        tree.add (1);
        tree.add (2);
        tree.add (7);
        tree.add (9);
        tree.add (2);
        tree.print ();

    }

    //
//        // 二叉排序树, 节点从左往右依次变大
    public static class Tree {//树体
        private Node1 root;

        //
//            // 按照顺序插入节点, 如果值一样，往右侧插入
        private void add(int val) {
            Node1 newNode = new Node1 (val);
            if (root == null) {
                root = newNode;
            } else {
                Node1 temp = root;
                // 插入值小于Node值
                while (temp != null) {
                    if (val < temp.data) {
                        // 把Node左侧的Node拿出来
                        Node1 leftNode = temp.left;
                        // 看下左边的节点是否存在
                        if (leftNode == null) {
                            // 如果不存在， 那么就放在这个节点上
                            temp.left = newNode;
                            // 设置为null 让while循环停止
                            temp = null;
                        } else {
                            // 如果存在， 把 leftNode 放到 temp上， 然后继续相同逻辑的循环
                            temp = leftNode;
                        }
                    } else {
                        Node1 rightNode = temp.right;
                        if (rightNode == null) {
                            temp.right = newNode;
                            temp = null;
                        } else {
                            temp = rightNode;
                        }
                    }
                }


            }

        }
        public void print(){//中序遍历

            Stack<Node1> stack = new Stack<> ();
            ArrayList<Integer> res = new ArrayList<> ();
            Node1 cur = root;
            while (!stack.isEmpty () || cur != null){
                while(cur != null){
                    stack.push (cur);
                    cur = cur.left;
                }
                Node1 tmp = stack.pop ();
                res.add (tmp.data);
                if(tmp.right != null){
                    cur = tmp.right;
                }

            }
            System.out.print (res);

        }


//
//            // 如果第一次插

//
//            // 遍历输出所有节点
////            private void print() {
////                Node tmp = root;
////                Node tmp1 = root.left;
////                Node tmp2 = root.right;
////                while (tmp != null) {
////                    System.out.println (root.data);
////
////                    if( (tmp1.left == null) &(tmp2 == null)){
////                        tmp = null;
////                    }else if((tmp1 == null)&(tmp2 != null)){
////                        System.out.println (tmp2.data);
////                        tmp2 = tmp2.right;
////                        tmp1 = null;
////
////                    }else if((tmp.1 != null)&(tmp.2 == null)){
////                        System.out.println (tmp1.data);
////                        tmp1 = tmp1.left;
////                        tmp2 = null;
////                    }else{
////                        System.out.println (tmp1.data);
////                        System.out.println (tmp2.data);
////                        tmp1 = tmp1.left;
////                        tmp2 = tmp2.right;
////                    }
////
////                }
////            }
//
//
//
//        private static class Node {
//            private int data;
//            private Node left;
//            private Node right;
//
//            public Node(int a) {
//                this.data = a;
//            }
    }
}
//
//
//
