public class PrimeNo {
    public static void main(String[] args) {
//        a prime no is a number that is divisible by 1 and itself.
//        only make checks less than the square root of a number.
        int n =20;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+" "+isPrime(i));
        }

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
