
import java.util.Scanner;

public class factorailofN {
    public static int Factorial(int n) {
        int f =1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
       int fact= Factorial(num);
        System.out.println("Factorial of n: "+ fact);
        
    }
}
