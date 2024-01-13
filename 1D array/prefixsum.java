import java.util.Scanner;

public class prefixsum {

    static void  printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] makeprefixsum(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
         System.out.println("Enter the array size");
         int n=sc.nextInt();
         int[] arr=new int[n];

         System.out.println("Enter the " +n+ " elements");

         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         printArray(arr);
        int[] ans= makeprefixsum(arr);
         printArray(ans);
         sc.close(); 
    }
}