import java.util.*;

public class decimalToBinary {

    public static void deciToBina(int deci){
        int bin_num=0,pow=0;
        int myNum=deci;
        while(deci>0){
            int rem= deci%2;
            bin_num=bin_num+ (rem*(int)Math.pow(10,pow));
            pow++;
            deci=deci/2;
        }
        System.out.println("Binary of "+myNum +" is: "+ bin_num);
    }

     public static void main(String[] args) {
        System.out.print("Enter a Decimal number : ");
        Scanner Sc =new Scanner(System.in);
        int d = Sc.nextInt();
        deciToBina(d);
       

    } 
}
