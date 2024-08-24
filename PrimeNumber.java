import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        // Q1. check the no. is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        int i,flag=0;
        for(i=2;i<a;i++){
            if(a%i==0){
                flag=1;
                System.out.println(a + " is not a prime number");
                break;
            }
        }
        if(flag==0){
            System.out.println(a+" is a prime number.");
        }

    }
    
}
