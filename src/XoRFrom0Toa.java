public class XoRFrom0Toa {
    public static void main(String[] args) {
//        if a % 4 = 0 then  ans == a.
//        if a % 4 = 1 then ans == 1.
//        if a % 4 = 2 then ans == a+1.
//        if a % 4 = 3 then ans == 0.
//
//         Range xor a,b = xor(b)^xor(a-1).
        int a =3;
        int b = 9;
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);

    }
    // this gives xor from zero to a
    static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if (a%4==2){
            return a+1;
        }
       return 0;
    }
}
