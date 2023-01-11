package basics;
import java.util.Scanner;


public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt(); // 89

        if(marks >= 90){
            System.out.println("Yay Party!");
        }
        else if(marks >= 80){
            System.out.println("Huh! life saved");
        }
        else if (marks >= 70){
            System.out.println("Some scolding given");
        }
        else{
            System.out.println("I'm doomed");
        }


        /**
         * Take an integer as input.
         *
         * If value of integer is equal to 5, print yay
         * if valye of integer is greater than 7 print yo
         * if some other value print po.
         */

    }
}
