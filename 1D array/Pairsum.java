/**
 * Pairsum
 */
import java.util.Scanner;
public class Pairsum {
      
    static int pairsum(int[] arr,int target){
        int n=arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }

   public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number");
         int n=sc.nextInt();
         int [] arr=new int[n];

         System.out.println("Enter"  + n + "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target:-");
        int target=sc.nextInt();

        System.out.println(pairsum(arr, target));
    }

   }
    
}