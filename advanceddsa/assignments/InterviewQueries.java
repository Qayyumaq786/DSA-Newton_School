package advanceddsa.assignments;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class InterviewQueries {

    static TreeMap<Integer, Integer> minMap;
    static TreeMap<Integer, Integer> maxMap;

    static void add(int el){
        minMap.put(el, minMap.getOrDefault(el,0)+1);
        maxMap.put(el, maxMap.getOrDefault(el,0)+1);
    }

    static void delete(int el){
        if(!minMap.containsKey(el)){
            System.out.println(-1);
            return;
        }

        minMap.put(el, minMap.get(el)-1);
        maxMap.put(el, maxMap.get(el)-1);

        if(minMap.get(el) == 0){
            minMap.remove(el);
            maxMap.remove(el);
        }
    }

    static int getMax(){
        if(maxMap.size() == 0){
            return -1;
        }
        return maxMap.firstKey();
    }

    static int getMin(){

        if(minMap.size() == 0){
            return -1;
        }

        return minMap.firstKey();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        minMap = new TreeMap<>();
        maxMap = new TreeMap<>(Collections.reverseOrder()) ;
        int q = sc.nextInt();
        while (q--!=0){
            int queryType = sc.nextInt();

            if(queryType == 1){
                int el = sc.nextInt();
                add(el);
            }
            else if(queryType == 2){
                int el = sc.nextInt();
                delete(el);
            }
            else if(queryType == 3){
                System.out.println(getMax());
            }
            else{
                System.out.println(getMin());
            }
        }
    }
}
