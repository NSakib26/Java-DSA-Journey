// 12345
// 1234
// 123
// 12
// 1

public class InvertedHalfPyramidwithNum {
    public static void IH_pyramid(int n){ 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            
         System.out.println();

        }

    }
    public static void main(String args[]){
        IH_pyramid(5);

    }
}
