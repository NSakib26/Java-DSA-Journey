//    *
//   **
//  ***
// ****


public class invartedRotatedHalf_Pyramid {
    public static void IRH_pyramid(int n){ 
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();

        }

    }
    public static void main(String args[]){
        IRH_pyramid(4);

    }
}
