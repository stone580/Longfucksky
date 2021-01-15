import java.util.*;

public class TestLinkedList<T> implements List<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public TestLinkedList() {

    }

    public void addFirst(T t) {
        Node<T> first = this.first;
        Node<T> newNode = new Node<>(t);
        this.first = newNode;
        if (first == null) {
            this.last = newNode;
        } else {
            first.previous = newNode;
        }
        size++;
    }

    public void addLast(T t) {
        Node<T> last = this.last;
        Node<T> newNode = new Node<>(t);
        this.last = newNode;
        if (last == null) {
            this.first = newNode;
        } else {
            this.last.previous = last;
            last.next = this.last;
        }
        size++;
    }

    private void killNode(Node<T> t) {
        Node<T> previous = t.previous;
        Node<T> next = t.next;
        if (previous == null) {
            first = next;
        } else {
            previous.next = next;
            t.previous = null; // 这里为了解除 链接， 让gc回收。
        }

        if (next == null) {
            last = previous;
        } else {
            next.previous = previous;
            t.next = null;
        }

        t.element = null;
        size--;
    }

    public Node<T> getByIndex(int index){//根据索引获得Node对象
        if(index < 0 || index > size - 1){
            throw new RuntimeException ("错误的索引："+index);
        }

        Node<T> tmp;
        if (index >= (size >> 1)){ //index大于等于1/2size，从后面检索
            tmp = last;
            for (int i = size - 1; i > index; i--){
                tmp = tmp.previous;
            }
        } else {
            tmp = first;
            for (int i = 0; i < index; i++){
                tmp = tmp.next;
            }
        }
        return tmp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        addLast(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (Node<T> x = first; x != null; x = x.next) {
            if (o.equals(x.element)) {
                killNode(x);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        c.forEach(this::addLast);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public T get(int index) {
        return getByIndex(index).element;
    }

    @Override
    public T set(int index, T element) {
        Node<T> x = getByIndex(index);
        T oldElement = x.element;
        x.element = element;
        return oldElement;
    }

    @Override
    public void add(int index, T element) {
        Node<T> i = getByIndex(index);
        Node<T> newNode = new Node<>(element);
        Node<T> previous = i.previous;
        if (previous == null) {
            first = newNode;
        } else {
            previous.next = newNode;
        }
        newNode.next = i;
        i.previous = newNode;
        size++;
    }

    @Override
    public T remove(int index) {
        Node<T> i = getByIndex(index);
        killNode(i);
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (Node<T> x = first; x != null; x = x.next) {
            if (o.equals(x.element))
                return index;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString(){ //重写Node的toString方法
        StringBuilder sb = new StringBuilder();
        Node<T> temp = first;
        while(temp != null){
            sb.append(temp.element).append(",");
            temp = temp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TestLinkedList<String> list = new TestLinkedList<>();
        list.add("A");
        list.add ("B");
        list.add ("C");
        list.add ("D");
        list.add ("E");
        list.add ("F");
        list.add ("G");

        System.out.println (list);
        System.out.println ("size为：" + list.size());

        System.out.println("B index: " + list.indexOf("B"));

        list.set(1, "BB");
        System.out.println ("after set BB: " + list);

        System.out.println("is empty: " + list.isEmpty());

        list.remove("F");
        System.out.println("after remove F: " + list);

        list.remove(1);
        System.out.println("after remove index 1: " + list);

        boolean d = list.contains("D");
        System.out.println("contains D: " + d);

        String s = list.get(1);
        System.out.println("get 3: " + s);


    }



    public static class Node<N> {
        Node<N> previous;//上一个节点
        Node<N> next; //下一个节点
        N element;//元素本身

        //构造方法
        public Node(Node<N> previous, Node<N> next, N element) {
            super ();
            this.previous = previous;
            this.next = next;
            this.element = element;
        }

        public Node(N element) {
            super ();
            this.element = element;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

}





