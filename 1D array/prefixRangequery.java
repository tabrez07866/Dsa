
import java.util.Scanner;

public class prefixRangequery  {

    static void  printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] makeprefixsum(int[] arr){
        int n=arr.length;
        

        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
         System.out.println("Enter the array size");
         int n=sc.nextInt();
         int[] arr=new int[n+1];

         System.out.println("Enter the " +n+ " elements");

         for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
         }
         printArray(arr);
        int[] prefsum= makeprefixsum(arr);

        System.out.println("Enter the quries");
        int q=sc.nextInt();
        while (q-- >0) {
            System.out.println("enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefsum[r]-prefsum[l-1];

            System.out.println("sum "+ans);
        }
         
         sc.close(); 
    }
}
