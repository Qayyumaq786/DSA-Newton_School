package basics;

public class WhileLoop {
    public static void main(String[] args) {
        // Suppose I want to print numbers from 1 to 100.
        // initialization
//        int num = 1;
//
//        while(num <= 100){
//            System.out.println(num);
//            num++;
//        }
//
//        System.out.println("Printed numbers till 100");

        // Print numbers from 100 to 200
//        int num = 100;
//
//        while(num <= 200){
//            System.out.println(num);
//            num = num+1;
//        }

        // Print all odd numbers between 1 to 1000
        // 1 3 5 7 9 11
//        int num = 1;
//
//        while(num <= 1000){
//            System.out.println(num);
//            num = num + 2;
//        }

        // Print all even numbers between 1 to 1000
//        int num = 2;
//
//        while(num <= 1000){
//
//            System.out.println(num);
//            num = num + 2;
//        }


        // Print numbers between 100 to 1 (inclusive both 100 and 1)

        // Compute sum of all numbers between 1 to 100
//        int sum = 0;
//        int num = 1;
//
//        while(num <=100){
//            sum = sum + num;
//            num++;
//        }
//        System.out.println(sum);

        // Sum of all odd numbers between 100 to 200
        int i = 100;
        int sum = 0;
        // 101+103+105........


        while(i<=200){

            if(i%2==1){
                sum+=i;
            }

            i++;
        }
        System.out.println(sum);
    }
}
