import java.util.*;
public class functions{
    public static void hello(){
        System.out.println("Hello");
    }

    public static int sum(int p, int q) //parameters or formal parameters
    {
        int sum = p + q;
        return sum;
    }

    public static int product(int p, int q){
        int c = p*q;
        return c;
    }

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int BinCoeff(int n, int r){
        int fac_n= factorial(n);
        int fac_r= factorial(r);
        int fac_nmr= factorial(n-r);
        int BinCoeff= fac_n/(fac_r*fac_nmr);
        return BinCoeff;
    }
    // Better way to check prime number                                                                                     op
    public static boolean isPrime(int n){
        if (n==2){     // corner case
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int BinToDec(int n){
        int dec = 0, pow = 0;
        while(n>0){
            int ld = n%10;
            dec+= ld* Math.pow(2,pow);
            n/=10;
            pow++;
        }
        return dec;
        
    }
    public static int DecToBin(int n){
        int bin = 0, pow=0;
        while(n>0){
            int rem = n%2;
            bin+= rem* Math.pow(10,pow);
            pow++;
            n/=2;
        }
        return bin;
    }

    public static void Palindrome(int n){
        int rev=n;
        int n1=0;
        while(n>0){
            int ld = n%10;
            n1= n1*10 + ld;
            n/=10;
        }
        if (n1==rev){
            System.out.println("Number is Palindrome...");
        }
        else{
            System.out.println("Number is not Palindrome...");
        }
    }
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sum(a,b); //arguments or actual parameters
        System.out.println(s);

        int p = sc.nextInt();
        int q= sc.nextInt();
        int r= product(p,q);
        System.out.println("product : " + r);

        int  n= sc.nextInt();
        int m= sc.nextInt();
        int f= BinCoeff(n,m);
        System.out.println("Binomial Coeffficient :" + f);

        int n=sc.nextInt();
        System.out.println("Binary of "+ n + " is : " + DecToBin(n));*/

        int r= sc.nextInt();
        Palindrome(r);
     }
}