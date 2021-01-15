package Container;

/*
get()方法
add（）方法
REMOVE()方法
addnode()方法
* 测试链表的插入*/


public class TestLinkedList {
    private Node first;
    private  Node last;
    private int size;


    public void addNode(int index,Object obj) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException ("错误的索引：" + index);
        }
        Node tmp = new Node(obj);
        if(index == 0){//增加位置为首节点时，赋值首节点，并设置首节点next
            tmp.next = first;
            first = tmp;
        }else if(index == size-1){//增加位置为尾节点时，赋值last，并设置原last的next值，新值的previous
            last.next = tmp;
            tmp.previous = last;
            last = tmp;
        }else{
            Node tmp1 = getByIndex (index-1);
            Node tmp2 = getByIndex (index);
            tmp1.next = tmp;
            tmp.previous = tmp1;
            tmp.next = tmp2;
            tmp2.previous = tmp;
        }
        size++;

    }

    public void remove(int index){//移除指定Node
        if(index==0){//移除首节点，重新赋值first
            first = first.next;
        }else if (index==size-1){//移除尾节点，将前一节点 next设为空，并将last赋值
            Node tmp = last.previous;
            tmp.next = null;
            last = tmp;

        }else{
            Node tmp1 = getByIndex(index-1);
            Node tmp2 = getByIndex(index+1);

            tmp1.next = tmp2;
            tmp2.previous = tmp1;
        }
        size--;


    }

    public Node getByIndex(int index){//根据索引获得Node对象
        if(index<0||index>size-1){
            throw new RuntimeException ("错误的索引："+index);
        }
        Node tmp = null;
        if(index>=size/2){//index大于等于1/2size，从后面检索
            tmp = last;
            for(int i =size-1;i>index;i--){
                tmp = tmp.previous;
            }
        }
        if(index<size/2){//index小于1/2size。从前面检索
            tmp = first;
            for(int i=0;i<index;i++){
                tmp = tmp.next;
            }
        }
        return tmp;
    }



    public Object get(int index){//根据索引得到Node对象的element
        if(index<0||index>size-1){
            throw new RuntimeException ("错误的索引："+index);
        }
        Node tmp = null;
        if(index>=size/2){//index大于等于1/2size，从后面检索
            tmp = last;
            for(int i =size-1;i>index;i--){
                tmp = tmp.previous;
            }
        }
        if(index<size/2){//index小于1/2size。从前面检索
            tmp = first;
            for(int i=0;i<index;i++){
                tmp = tmp.next;
            }
        }
        return tmp.element;

    }


    public void  add(Object obj){//增加Node,顺序添加
        Node node = new Node(obj);
        if(first == null){
            first = node;
            last = node;

            node.previous = null;
            node.next = null;
        }else{
            node.previous = last;
            node.next = null;

            last.next = node;
            last = node;
        }
        size++;

    }
    public String toString(){//重写Node的toString方法
        Node temp = first;
        while(temp != null){
            System.out.println (temp.element);
            temp = temp.next;
        }
        return "";
    }

    public static void main(String[] args) {
        TestLinkedList list = new TestLinkedList();
        list.add("A");
        list.add ("B");
        list.add ("C");
        list.add ("D");
        list.add ("E");
        list.add ("F");
        list.add ("G");
        //System.out.println (list);

        System.out.println (list);
        System.out.println ("size为："+list.size);
        //System.out.println (10>>1); //位运算向右移一位，相当于除以2
//        System.out.println (list.get (2));
//        System.out.println (list);
//        list.remove (6);
//        System.out.println (list);
//        System.out.println ("size为："+list.size);
        list.addNode (2,"S");
        System.out.println (list);
        System.out.println ("size为："+list.size);

//        Node s=list.getByIndex (0);
//        System.out.println (s.element);


    }






}

