package ds;

import java.util.*;

public class QueueOp {
    public void queue() {
        Scanner s = new Scanner(System.in);

        System.out.println("\n---Queue selected---");

        Queue<Integer> que = new LinkedList<Integer>();

        System.out.println(
                "Enter operation: \n1. Enque \n2. Deque \n3. Peek \n4. View \n5. IsEmpty \n6. Size \n7. Exit");

        while (true) {
            System.out.println("Choice: ");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter size: ");
                    int n = s.nextInt();

                    System.out.println("Enter elements: ");
                    for (int i = 0; i < n; i++) {
                        que.add(s.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("Removed item(Deque): " + que.remove());
                    break;
                case 3:
                    System.out.println("Head element of queue is: " + que.peek());
                    break;
                case 4:
                    System.out.println("Queue elements are: " + que);
                    break;
                case 5:
                    if (que.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 6:
                    System.out.println("Queue Size: " + que.size());
                    break;
                case 7:
                    return;

            }
        }
    }
}
