package ds;

import java.util.Scanner;

import ds.search.*;
import ds.sort.*;

public class DSMain {
    public static void dsMain(){
        Scanner s1 = new Scanner(System.in);
            System.out.println("=========== (Data Structure) ==========");
                    System.out.println(" 01.Bubble sort \n 02.Insertion sort \n 03.Selection sort \n "
                            + "04.Marge sort \n 05.Quick sort \n 06.Counting sort \n "
                            + "07.Radix sort \n 08.Heap sort \n 09.Bin sort \n "
                            + "10.Shell sort \n 11.Linear search \n 12.Binary search \n "
                            + "13.Euclidean GCD Algorithm \n 14.Universal hashing \n 15.Stack \n "
                            + "16.Queue \n 17.Linked List \n 18.Fibonacci Numbers \n 19.Recurrence ");
                    System.out.println("===================X===================");
                    System.out.print("\nEnter your choice:> ");
                    int c1 = s1.nextInt();

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
                            MergeSort mSort = new MergeSort();
                            mSort.mergeSort();
                            break;
                        case 5:
                            QuickSort qSort = new QuickSort();
                            qSort.quickSort();
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
                            BinSort binSort = new BinSort();
                            binSort.binSort();
                            break;
                        case 10:
                            ShellSort shellSort = new ShellSort();
                            shellSort.run();
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
                            Fibonacci fibonacci = new Fibonacci();
                            fibonacci.run();
                            break;
                        case 19:
                            break;
                        default:
                            break;

                    }
        
    }
}
