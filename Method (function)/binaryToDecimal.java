
import java.util.*;

public class binaryToDecimal {

    public static void binToDeci(int bin_num){
        int decimal=0,pow=0;
        int myNum=bin_num;
        while(bin_num>0){
            int lastdigit=bin_num%10;
            decimal=decimal+(lastdigit*(int) Math.pow(2,pow));
            pow++;
            bin_num=bin_num/10;
        }
        System.out.println("Decimal of "+myNum +" is: "+ decimal);
    }
    public static void main(String[] args) {
        System.out.print("Enter a Binary number : ");
        Scanner Sc =new Scanner(System.in);
        int b = Sc.nextInt();
        binToDeci(b);

    }
}
