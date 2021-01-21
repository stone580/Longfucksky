package Container;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {
    Node1 root;

    private Node1 addNode(Node1 current, int value){//增加节点的方法
        if(current == null){
            return new Node1(value);//返回Node1，便于下面语句赋值
        }
        if(value < current.data){
            current.left = addNode (current.left,value);
        }
        if(value > current.data){
            current.right = addNode (current.right,value);
        }
        return current;
    }


    private void addNode(int value){//增加节点，把任意值写入节点

        root = addNode (root,value);//从root节点遍历比较值。调用上面的方法
    }
    private void inOrder(){  //中序遍历
        Stack<Node1> stack = new Stack<> ();
        ArrayList<Integer> res = new ArrayList<> ();
        Node1 cur = root;

        do{
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
        while (!stack.isEmpty () || cur != null);
        System.out.print (res);

    }


    private void  preOrder(){//前序遍历
        Stack<Node1> stack = new Stack<> ();
        ArrayList<Integer> res = new ArrayList<> ();
        if(root == null){
            System.out.println ("二叉树为空");
        }
        stack.push (root);
        while(!stack.isEmpty ()){
            Node1 cur = stack.pop ();
            res.add (cur.data);
            if(cur.right != null){
                stack.push (cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
        System.out.println (res);



    }



    public static void main(String[] args) {
        BinaryTree s = new BinaryTree ();
        s.addNode (6);
        s.addNode (4);
        s.addNode (5);
        s.addNode (7);
        s.addNode (2);
        s.addNode (1);
        s.addNode (0);
        s.addNode (3);
        System.out.println ("*******");
        s.preOrder ();
        s.inOrder ();


    }
}
