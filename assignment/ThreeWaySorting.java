package assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ThreeWaySorting {
    /**
     arr[]

     [a,b]


     [0,1,2] LinkedList

     0 -> All elements less than a
     1 -> All elements in the range of a & b
     2 -> All elements greater than b

     1 8 3 3 4
     a=3 b = 5

     0-> 1
     1-> 3,3,4
     2->  8

     1 3 3 4 8

     */
    static ArrayList<Integer> sortThreeWay(ArrayList<Integer> arr, int a, int b){
        HashMap<Integer, LinkedList<Integer>> hm = new HashMap<>();
        hm.put(0, new LinkedList<>());
        hm.put(1, new LinkedList<>());
        hm.put(2, new LinkedList<>());

        for(int el: arr){
            if(el<a){
                hm.get(0).add(el);
            }
            else if(el>=a && el<=b){
                hm.get(1).add(el);
            }
            else{
                hm.get(2).add(el);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<=2;i++){
            for(int el: hm.get(i)){
                res.add(el);
            }
        }
        return res;
    }



}
