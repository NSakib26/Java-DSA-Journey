import java.util.*;
public class PrimeNumOrNOT {
    public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    int num=Sc.nextInt();
    boolean isPrime=true;

    for(int i=2;i<=num-1;i++){
        if(num%i==0){
         isPrime=false;
        }
    }
    if(isPrime==true){
        System.out.println(num +" is a prime number");
    }else{
    System.out.println(num +" is not a prime number");
    }
}
}