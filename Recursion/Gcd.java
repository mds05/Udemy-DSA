import java.util.*;
public class Gcd{
    public static int gcd(int a, int b){
        int temp=0;
        if(b>a){
            temp=b;
            b=a;
            a=temp;
        }
        if(b==0){
            return a;
        }
        else if(a<0 || b<0){
            return -1;
        }
        else{
            temp=b;
            b=a%b;
            a=temp;
            return gcd(a,b);
            //return gcd(b,a%b)
            //this would only work if lines 14-16 are not implemented.
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println(gcd(sc.nextInt(),sc.nextInt()));
            }
            catch(InputMismatchException e){
                System.out.println("Only integer numbers are allowed.");
            }
    }
}