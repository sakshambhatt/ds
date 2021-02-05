//Implement queues and functions isFull, isEmpty, peek, enqueue and dequeue using arrays
package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Queue {
    int[] queue;
    int front;
    int back;
    int n;

    Queue(int size) {
        queue = new int[size];
        front = size - 1;
        /*
        important to initialize back = size, just like we initialized top = -1 in stack
        both size and -1 are inaccessible indices
        */
        back = size;
        n = size;
    }
}

public class Main {
    public static boolean isEmpty(Queue q) {
        return q.back == q.n;
    }

    public static boolean isFull(Queue q) {
        return q.back == 0;
    }

    public static int peek(Queue q) {
        return q.queue[q.front];
    }

    public static void enqueue(int elementToInsert, Queue q) {

        q.back -= 1;
        q.queue[q.back] = elementToInsert;
    }


    public static void dequeue(Queue q) {
        int buffer = q.queue[q.front];
        if (!isEmpty(q)) {
            int i;
            for (i = q.front; i > q.back; i--) q.queue[i] = q.queue[i - 1];
            q.back = i + 1;
//            System.out.println("back = " + q.back);
            System.out.println(buffer);
        } else {
            System.out.println("queue is empty!");
        }
    }

    public static void display(Queue q) {
        if (!isEmpty(q)) {
            for (int i = q.front; i >= q.back; i--) {
                System.out.println(q.queue[i]);
            }
        } else {
            System.out.println("queue is empty!");
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        System.out.println("enter size of queue:");
        Queue q = new Queue(fr.nextInt());
        for (; ; ) {
            System.out.println("choose operation:\n1. isEmpty\n2. isFull\n3. peek\n4. enqueue\n5. dequeue\n6. display"
                    + "\n7. exit");
            int choice = fr.nextInt();
            switch (choice) {
                case 1 -> System.out.println(isEmpty(q));
                case 2 -> System.out.println(isFull(q));
                case 3 -> System.out.println(peek(q));
                case 4 -> {
                    if (!isFull(q)) {
                        System.out.println("enter element to insert:");
                        enqueue(fr.nextInt(), q);
                    } else {
                        System.out.println("queue is full!");
                    }
                }
                case 5 -> dequeue(q);
                case 6 -> display(q);
                case 7 -> System.exit(0);
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
