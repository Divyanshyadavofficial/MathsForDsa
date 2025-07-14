public class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        int p = 3;
//        System.out.printf("%.3f",sqrt(num,p));
        System.out.println(Newton(40));
    }
//    O(log(n)) time complexity.
    static double sqrt(int n,int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while(s<=e){
            int m = s+(e-s)/2;
            if (m*m==n){
                return m;
            }
            if(m*m>n){
                e = m-1;
            }else{
                s=m+1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
//    newton raphson method
//    root = (x+n/x)/2. root = actual root and x = assumed root
//    for a given n
//    error = |root-x|
//    step 1 assign x to N
//    step 2 you will find your ans when error < 1.
//    step 3 update the value of x.
//    complexity
//    O((log n)f(n))
//    f(n) = cost of calculating f(x)/f'(x)
    static double Newton(double n){
        double x=n;
        double root;
        while (true){
            root = 0.5*(x+(n/x));
           if(Math.abs(root-x)<1){
               break;
           }
           x=root;
        }
        return root;
    }

}
