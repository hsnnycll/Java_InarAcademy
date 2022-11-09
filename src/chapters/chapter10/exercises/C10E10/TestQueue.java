package chapters.chapter10.exercises.C10E10;

public class TestQueue {
    public static void main(String[] args) {

        Queue queue = new Queue();
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
