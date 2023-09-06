package Linked_List;

public class LinkedList<T> {
    private static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

    }
    private Node<T> head;
    /**
     * Конструктор по умолчанию.
     */
    public LinkedList(){
        head = null;
    }
    /**
     * Конструктор_с_параметрами
     */
    public LinkedList(T[] data){
        for (T datum : data) {
            Add(datum);
        }
    }
    /**
     * Реверс
     */
    public void Reverse(){
        Node<T> previousNode = null;
        Node<T> currentNode = head;
        Node<T> nextNode = null;
        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }
    /**
     * Добавление
     */
    public void Add(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) head = newNode;
        else {
            Node<T> curNode = head;
            while (curNode.next != null){
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    /**
     * Печать
     */
    public void Print(){
        Node<T> t = head;
        while (t != null){
            System.out.print(t.getData() + " ");
            t = t.getNext();
        }
        System.out.println();
    }

}
