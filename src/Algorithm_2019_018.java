/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

import algorithm.DFS;
import algorithm.Graph;
import algorithm.KnapSack;
import ds.QueueOp;
import ds.StackOp;
import ds.search.*;
import ds.sort.*;

/**
 *
 * @author easin
 */
public class Algorithm_2019_018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("============= (Algorithm) =============");
            System.out.println(" 1) Data Structure \n 2) Algorithms");
            System.out.print("Enter your choice:> ");
            int choice = s.nextInt();
            System.out.println("=======================================");

            if (choice == 1) {
                System.out.println("=========== (Data Structure) ==========");
                System.out.println(" 01.Bubble sort \n 02.Insertion sort \n 03.Selection sort \n "
                        + "04.Marge sort \n 05.Quick sort \n 06.Counting sort \n "
                        + "07.Radix sort \n 08.Heap sort \n 09.Bin sort \n "
                        + "10.Shell sort \n 11.Linear search \n 12.Binary search \n "
                        + "13.Euclidean GCD Algorithm \n 14.Universal hashing \n 15.Stack \n "
                        + "16.Queue \n 17.Linked List \n 18.Fibonacci Numbers \n 19.Recurrence ");
                System.out.println("===================X===================");
                System.out.print("Enter your choice:> ");
                int c1 = s.nextInt();

                switch (c1) {
                    case 1:
                        BubbleSort bSort = new BubbleSort();
                        bSort.bubbleSort();
                        break;
                    case 2:
                        InsertionSort iSort = new InsertionSort();
                        iSort.insertionSort();
                        break;
                    case 3:
                        SelectionSort sSort = new SelectionSort();
                        sSort.selectionSort();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        CountingSort cSort = new CountingSort();
                        cSort.countSort();
                        break;
                    case 7:
                        RadixSort rSort = new RadixSort();
                        rSort.radixSort();
                        break;
                    case 8:
                        HeapSort hSort = new HeapSort();
                        hSort.heapSort();
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        LinSearch lSearch = new LinSearch();
                        lSearch.linearSearch();
                        break;
                    case 12:
                        BinSearch binSearch = new BinSearch();
                        binSearch.binarySearch();
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        StackOp stkOp = new StackOp();
                        stkOp.stack();
                        break;
                    case 16:
                        QueueOp queOp = new QueueOp();
                        queOp.queue();
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    default:
                        break;

                }
            } else if (choice == 2) {
                System.out.println("=========== (Algorithm) ==========");
                System.out.println(
                        " 01.Largest common subsequence \n 02.Optimal Binary Search Tree \n 03.Matrix chain multiplication \n "
                                + "04.Strassens's matrix multiplication \n 05.BFS \n 06.DFS \n "
                                + "07.DAG \n 08.Longest increasing subsequence \n 09.Topological sort \n "
                                + "10.Krushkal's algorithm \n 11.Prim's algorithm \n 12.Dijkastra's algorithm \n "
                                + "13.Bellman ford's algorithm \n 14.Warshall's algorithm \n 15.(0,1) KKnapsack problem \n "
                                + "16.Naive string matching algorithm \n 17.Rabin krap string matching algorithm \n 18.Activity selection problem \n "
                                + "19.Recurrence \n 20.Max flow min cut");
                System.out.println("===================X===================");
                System.out.print("Enter your choice:> ");
                int c1 = s.nextInt();

                switch (c1) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        DFS dfs = new DFS();
                        dfs.search(0);
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        KnapSack ks = new KnapSack();
                        ks.runKnapSack();
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    case 20:
                        break;
                    default:
                        break;
                }

            } else {
                System.out.println("Invalid");
            }
        }

    }

}
