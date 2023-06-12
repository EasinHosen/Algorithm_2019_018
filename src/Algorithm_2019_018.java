/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

import algorithm.*;
import ds.DSMain;

/**
 *
 * @author easin
 */
public class Algorithm_2019_018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("============= (Algorithm) =============");
            System.out.println(" 1) Data Structure \n 2) Algorithms \n 3) Exit");
            System.out.print("Enter your choice:> ");
            int choice = s.nextInt();
            System.out.println("=======================================");

            switch (choice) {
                case 1:
                    DSMain.dsMain();
                    break;
                case 2:
                    AlgorithmMain.algoMain();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input, try again!!");
                    break;
            }
        }
    }

}
