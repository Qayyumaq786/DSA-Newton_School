package advanceddsa.backtracking;

public class GenerateBinaryStrings {

    static void generateBinaryStrings(int n){
        generateBinaryStringsUtil(n-1, new char[n]);
    }

    static void generateBinaryStringsUtil(int i, char[] arr){
        if(i < 0){
            System.out.println(new String(arr));
            return;
        }

        arr[i] = '0';
        generateBinaryStringsUtil(i-1, arr);

        arr[i] = '1';
        generateBinaryStringsUtil(i-1, arr);
    }

    public static void main(String[] args) {
        generateBinaryStrings(3);
    }

}
