import java.util.*;
public class Unique{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //How to find all pairs of integers whose sum is equal to a given number?
        int targ=10;
        int [] arr1={1,2,3,4,5,7,7,8,9,10,11,12};
        boolean unique=true;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    unique=false;
                    break;
                }
            }
            if(unique==false){
                break;
            }
        }
        if(unique==false){
            System.out.println("not unique");
        }
        else{
            System.out.println("unique");
        }
    }
}