public class powerOf2 {
    public static void main(String[] args) {
        int n = 16;// fix for n ==0.
        boolean ans = (n&(n-1))==0;
        System.out.println(ans);
    }
}
