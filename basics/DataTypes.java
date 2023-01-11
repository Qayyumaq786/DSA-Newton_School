package basics;

public class DataTypes {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println((float)a/b); // 12/5 = 2.4

        float f = 1.1111111111f;
        System.out.println(f);

        // write a program to swap two float numbers
        float num1 = 1.2f;
        float num2 = 2.4f;
        float temp = num1;
        num1 = num2;
        num2 = temp;


        // let's test comparison operator
        System.out.println(1==1);
        System.out.println(1==2);

        int i = 1;
        i++; // i = i+1;
        System.out.println(i);
        i--; // i = i-1;
        System.out.println(i);

        int j = 0;

        System.out.println("Unary operators on j");
        System.out.println(j++);  // puts value of j and then increments it
        System.out.println(j); // j =1
        System.out.println(++j); // first increments value then puts it
        System.out.println(j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);
    }
}
