import java.util.*;
public class patterns{
    public static void hollow_rectangle(int rows, int cols){
        for(int i=1;i<=rows;i++){
           for(int j=1;j<=cols;j++){
               if ((i==1 || i==rows) || (j==1 || j==cols)){
                   System.out.print("*");
               }
               else{
                   System.out .print(" ");
               }
           }
           System.out.println();
        }
       
    }
    public static void inverted_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_number_pyramid(int n){
        for(int i=1;i<=n-1;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(n-j);
            }
            System.out.println();
        }  
    }

    public static void bin_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        // 1st half
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("* ");
           }
           System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=n;k++){
                if(i==1 || i==n ||  k==1 || k==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void num_pyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindrome_triangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k + " ");
            }
            for (int k=i;k>=1;k--){
                if (i==1){
                    continue;
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         palindrome_triangle(5);
    }
}