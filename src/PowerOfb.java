public class PowerOfb {
    public static void main(String[] args) {
        // 3**110 = 3**4+3**2+3**0.
        int base = 3;
        int power = 6;
        int ans =1;
        while(power > 0){
            if((power&1)==1){
                ans*=base;
            }
            base*=base;
            power = power>>1;
        }
        System.out.println(ans);

    }
}
