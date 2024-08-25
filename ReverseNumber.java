public class ReverseNumber {
    static int reverse(int n){
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
            
        }
        return rev;
    }
    // using recursion

    static int rev=0;
    static void revRec(int n){
        if(n<=0)
            return;
        int rem=n%10;
        rev=(rev*10)+rem;
        revRec(n/10);
    }
    public static void main(String[] args) {
        int a =50;
        // System.out.println(reverse(a));
        revRec(a);
        System.out.println(rev);
        
    }
}
