import java.util.*;
public class Power{
    public static int powerNum(int a,int b){
        if(b<0){
            return -1;
        }
        if(b==0){
            return 1;
        }
        else{
            return a*powerNum(a,b-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println(powerNum(sc.nextInt(),sc.nextInt()));
            }
            catch(InputMismatchException e){
                System.out.println("Only integer numbers are allowed.");
            }
    }
}


//How to calculate power of a number using recursion?