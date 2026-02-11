package Maths;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //fun(n--); this will run an infinte loop as it will keep putting value as 5 and then subtracting it
        fun(--n);
    }
}
