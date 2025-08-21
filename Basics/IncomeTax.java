import java.util.*;

public class IncomeTax {

    public static void main(String args[]){
        System.out.print("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax;
        if ( income <500000){
            tax= 0;
            System.out.println("Tax is : "+ tax);
        }
        if(income ==500000 &&  income <1000000){
            tax =(float) ((float)income*0.2);
            System.out.println("Tax is : "+ tax);
        }
        else if( income > 1000000 ){
            tax= (float) ((float)income * 0.3);
            System.out.println("Tax is : "+ tax);
        }
        

    }
}
