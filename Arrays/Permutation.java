public class Permutation  {
    public static void main(String[] args){
        int[] arr1={2,1,3,5,4,6};
        int [] arr2={1,3,2,4,5};
        int temp=0;
        if(arr1.length==arr2.length){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[j]<arr1[i]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for(int i=0;i<arr2.length-1;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[j]<arr2[i]){
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        boolean perm=true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                perm=false;
                break;
            }
        }
        if(perm==true){
            System.out.println("Permutation");
        }
        else{
            System.out.println("Not a permutation");
        }
    }
    else{
        System.out.println("not a permutation of each other.");
    }
 }
}