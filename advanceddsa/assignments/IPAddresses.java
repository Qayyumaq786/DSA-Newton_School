package advanceddsa.assignments;

import java.util.Scanner;

public class IPAddresses {
    static void generateIpAddresses(String s){

        generateIpAddressesUtil(s,
                "",
                0,
                s.length(),
                4);

    }

    static void generateIpAddressesUtil(String s, String cur,
                                        int start, int n,
                                        int dots){

       // I've put all the dots and reached the end of the string.
        if(dots==0 && start==n){
            System.out.println(cur.substring(1));
            return;
        }

        // We will consider strings from length 1 to 3.
        for(int i=start; i< start+3 && i<n; i++){
            String curNumber = s.substring(start, i+1);

            // Check for conditions on current number
            boolean isLeadingZero = (curNumber.charAt(0)=='0'
                    && curNumber.length() > 1);
            if(isLeadingZero
                    || Integer.parseInt(curNumber) > 255){
                return;
            }

            generateIpAddressesUtil(s,
                    cur+"."+curNumber,
                    i+1,n,
                    dots-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        generateIpAddresses(s);
    }
}
