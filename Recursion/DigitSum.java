import java.util.*;
public class DigitSum{
    public static int sum(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        else{
            return (n%10)+sum(n/10);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //How to find the sum of digits of a positive integer using recursion?
        try{
        System.out.println(sum(sc.nextInt()));
        }
        catch(InputMismatchException e){
            System.out.println("Only integer numbers are allowed.");
        }
    }
}