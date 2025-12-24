public class Queue {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(12);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(43);
        queue.display();

    }
}