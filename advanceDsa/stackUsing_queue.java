package advanceDsa;

import java.util.LinkedList;
import java.util.Queue;


public class stackUsing_queue {
    static  class Stack{
        static Queue<Integer>Q1=new LinkedList<>() ;

        static void push(int d){
            Q1.add(d);
            for (int i=0;i< Q1.size()-1;i++){
                Q1.add(Q1.peek());
                Q1.remove();
            }
        }
        static int pop(){
            if(Q1.isEmpty()){
                return 0;

            }
            else{
                return Q1.remove();
            }
        }
        static int  peek(){
            if (Q1.isEmpty()){
                return 0;
            }
            else {
                return Q1.peek();
            }
        }




    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(23);
        st.push(43);
        st.push(267);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
    }


}
