import java.util.Scanner;

public class sortsqure {

    
    static void  printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

   static int[] SortArr(int[] arr){
       int n=arr.length;
       int left=0;
       int right=n-1;

       int[] ans=new int[n];
       int k=0;

       while(left<=right){
        if(Math.abs(arr[left]) > Math.abs(arr[right])){
            ans[k++]=arr[left]*arr[left];
            left++;
        }
        else{
            ans[k++]=arr[right]*arr[right];
            right--;
        }
       }
       return ans;
   }

   static void reverse(int[] arr){
    int n=arr.length;
    int left=0;
    int right=n-1;
    while (left<right) {
        swap(arr, left, right);
        left++;
        right--;
    }
   }
    

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Original array");
        printArray(arr);

       int[] ans =SortArr(arr);
       reverse(ans);
       printArray(ans);

    
        
        sc.close();
    }
}
