
import java.util.Scanner;

public class isPrimeFun {
   public static  boolean isPrime(int n){
        //corner case 
        //2
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to check prime or not :");
        int n=sc.nextInt();

        System.out.println(isPrime(n));
    }
}
