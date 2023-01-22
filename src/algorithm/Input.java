package algorithm;

import java.util.Scanner;

/**
 *
 * @author easin
 */
public class Input {
    Scanner s = new Scanner(System.in);
    
    
//    public int[] listInput(int... a){
////        System.out.println("Enter the number of element: ");
////        int n = s.nextInt();
//        System.out.println("Enter the numbers: ");
//        
////        int list[] = new int[n];
////        for(int i =0; i<a.length; i++){
////            System.out.print("index{"+i+"}= ");
////            a[i] = s.nextInt();
////        }
//        for(int x:a){
//            x=s.nextInt();
//        }
//
//        return a;
//    }
    
    public int[] listInput(){
        System.out.println("Enter the number of element: ");
        int n = s.nextInt();
        System.out.println("Enter the numbers: ");
        
        int list[] = new int[n];
        for(int i =0; i<list.length; i++){
            System.out.print("index{"+i+"}= ");
            list[i] = s.nextInt();
        }

        return list;
    }
}
