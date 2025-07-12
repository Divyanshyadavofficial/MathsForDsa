public class magicNo {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;
        while (n>0){
            int last = n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
// no of digits in base b
// 6 = 1 digit
// 110 = 3 digit
// keep a counter till num ==0.
// formula
// log2(6) = x
// 6 = 2**x
// x represents the number of digits in the representation of the base.

// no. of digits of base b of no. n
// == int(log(b)n)+1 here b is a log base
