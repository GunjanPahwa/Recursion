public class Sieve {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1]; //as array starts from 0
        //this creates a boolean array of size n+1
        //all items will be false initially
        seive(n,primes);

    }
    static void seive(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(primes[i]==false){ //basically saying prime numbers are false
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i]==false){
                System.out.println(i+" ");
            }
        }

    }
}
