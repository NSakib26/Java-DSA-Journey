import java.util.*;
public class PrimeNumOrNOT {
    public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    int num=Sc.nextInt();
    for(int i=2;i<=num-1;i++){
        if(num%i==0){
            System.out.println(num +" is not prime");
        }else
        System.out.println(num +"is prime number ");

    }
}
}
