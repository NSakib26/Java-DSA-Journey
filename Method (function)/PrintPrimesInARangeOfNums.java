import java.util.*;

public class PrintPrimesInARangeOfNums {

     public static  boolean isPrime(int n){
        //corner case 
        //1
        if (n < 2) return false;
         
        //2
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;

    }

    public static  void PrintPrime(int a, int b){
        for(int i =a; i<=b;i++){
            if(isPrime(i)){
                System.out.print(i +" ");

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range :");
        int R1=sc.nextInt();
        System.out.println("To ");
        int R2= sc.nextInt();

        PrintPrime(R1, R2);
    }
}
