import java.util.*;
public class pair{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //How to find all pairs of integers whose sum is equal to a given number?
        int targ=10;
        int [] arr1={1,2,3,4,5,6,7,8,9,10,11,12};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length && j!=i;j++){
                if(arr1[i]+arr1[j]==targ){
                    System.out.println(arr1[i]+", "+arr1[j]);
                }

            }
        }
    }
}