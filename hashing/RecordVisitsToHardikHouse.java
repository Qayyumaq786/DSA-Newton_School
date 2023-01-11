package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class RecordVisitsToHardikHouse {

    static void processGuest(HashMap<String, Integer> hm, String key){

        Integer value = hm.get(key);

        if(value == null){
            System.out.println("Value is null, seems like first visit of the guest");
        }

        Integer getDefaultValue = hm.getOrDefault(key, 0);
        System.out.println("Get default value ="+getDefaultValue);

        hm.put(key, hm.getOrDefault(key, 0)+1);

        System.out.println(hm);

        System.out.println("this seems to be persons "+ hm.get(key) +" visit");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer>  hm = new HashMap<>();
        while(true){
            System.out.println("Tell the name of the guest");
            String guest = sc.next();
            processGuest(hm, guest);
        }
    }
}
