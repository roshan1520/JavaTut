public class PrimeToN{
    static boolean isPrime(int n){
        
        for (int i=2;i<n;i++){
            if (n%i==0){
                
                return false;
            }
        }
        return true;
           
        
    }

    public static void main(String[] args){
        int n=45;
        for(int a=2;a<n;a++){
            if(isPrime(a)){
                System.out.println(a);
            }

        }
        
    }
}