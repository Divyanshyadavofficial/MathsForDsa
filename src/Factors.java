public class Factors {
    public static void main(String[] args) {
//        n= 20-->1,2,4,5,10,20
        factors2(20);

    }
    static void factors1(int n){
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }

        }
    }

    static void factors2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                if (n/i == i) {
                    System.out.print(i+" ");

                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }

        }
    }
}
