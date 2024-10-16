public class MissingNumbers{
    public static void main(String[]args){
        int [] arr={1,2,3,4,6,7,8,9,10};
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=10;i++){
            sum1+=i;
        }
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        System.out.println((sum1-sum2)+ " is the missing number." );
    }
}