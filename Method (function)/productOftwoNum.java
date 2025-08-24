
import java.util.*;
public class productOftwoNum {
    public static int multiplay(int a, int b){
        int product=a*b;
        return product ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
          System.out.println("Product : " + multiplay(a, b));
    }
}
