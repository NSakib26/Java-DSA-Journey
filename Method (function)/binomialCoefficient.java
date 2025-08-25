import java.util.Scanner;

public class binomialCoefficient {
   //n!
    public static int Factorial(int n) {
        int f =1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    //nCr
    public static int binomialCoef (int n,int r){
        int  n_fact =Factorial(n);
        int  r_fact =Factorial(r);
        int  nmr_fact =Factorial(n-r);
        int bioCoeff = ( n_fact/(r_fact*nmr_fact));
        
        return bioCoeff;
        
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
           int n = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("Bionomial coefficient : "+ binomialCoef(n, r));
        
       
    }
}
