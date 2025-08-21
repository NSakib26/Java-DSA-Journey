import java.util.*;
public class largetOf3nums {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A= sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        if(A>B && A>C){
            System.out.println(A +" is the largest");
        }
        else if(B>A && B>C){
            System.out.println(B +" is the largest");
        }
        else {
            System.out.println(C +" is the largest");
        }


    }

}
