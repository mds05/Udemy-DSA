import java.util.*;
public class DecToBin{
    public static int decToBin(int n){
        if(n==0){
            return 0 ;
        }
        else{
            return 10*decToBin((n/2))+(n%2); 
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //How to Convert a number from decimal to Binary using recursion?
        try{
            System.out.println(decToBin(sc.nextInt()));
            }
            catch(InputMismatchException e){
                System.out.println("Only integer numbers are allowed.");
            }
    }
}