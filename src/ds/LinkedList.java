package ds;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Element " + data + " inserted successfully!");
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else {
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Element " + data + " deleted successfully!");
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element " + data + " not found in the linked list.");
        } else {
            previous.next = current.next;
            System.out.println("Element " + data + " deleted successfully!");
        }
    }
    public  void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the linked list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int insertData = scanner.nextInt();
                    insert(insertData);
                    break;
                case 2:
                    System.out.print("Enter the element to delete: ");
                    int deleteData = scanner.nextInt();
                    delete(deleteData);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        // scanner.close();
    }
}


    

