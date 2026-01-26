public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        if(n==5){ //basically break when n=5, this is a base condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);//tail recursion
        //this is the last function call
    }

}
