import java.util.Scanner;
public class NumbersExample {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers: 1 2 3 4 5
        print1(1);
    }
    //static void print1(int n){
       // for(int i=1;i<=n;i++){
           // System.out.print(i+" ");
       // }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);}

}
