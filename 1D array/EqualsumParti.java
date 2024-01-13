import java.util.Scanner;

public class EqualsumParti {
     
    static int findArraySum(int[] arr){
      int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
         
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
           prefSum+=arr[i];
           int suffixSum=totalSum-prefSum;
            if(suffixSum==prefSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("equal part possible :-"+equalSumPartition(arr));
        sc.close(); 
    }
}
