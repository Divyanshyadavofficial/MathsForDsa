public class returnTheNumThatAppearOnce {
    public static void main(String[] args) {
//        A^A = 0.
        int[] arr ={2,3,3,4,4,2,6};
        System.out.println(ans(arr));
    }
    private static int ans(int[]arr){
        int unique = 0;
        for (int n:arr){
            unique^=n;
        }
        return unique;
    }
}
