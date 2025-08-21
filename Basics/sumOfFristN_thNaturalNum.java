import java.util.*;
public class sumOfFristN_thNaturalNum {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println("Sum =" + sum);
    }
}
