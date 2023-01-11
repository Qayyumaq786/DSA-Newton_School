package basics;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        /**
         * Write a program to print numbers in words from 1 to 5.
         * If number is greater than 5, print not supported.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1){
            System.out.println("One");
        }
        else if(n==2){
            System.out.println("Two");
        }
        else if(n==3){
            System.out.println("Three");
        }
        else if(n==4){
            System.out.println("Four");
        }
        else if(n==5){
            System.out.println("Five");
        }
        else{
            System.out.println("Not supported");
        }

        switch (n){
            case 1: {
                System.out.println("One");
                break;
            }
            case 2:{
                System.out.println("Two");
                break;
            }
            case 3: {
                System.out.println("Three");
                break;
            }
            case 4:{
                System.out.println("Four");
                break;
            }
            case 5:{
                System.out.println("Five");
                break;
            }
            default: {
                System.out.println("Not supported");
                break;
            }
        }
    }
}
