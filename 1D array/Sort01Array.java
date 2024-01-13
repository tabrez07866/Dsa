import java.util.Scanner;

public class Sort01Array {

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


    //with one loop
    static void sortZeroOnes1(int[] arr){
     int n=arr.length;
     int left=0,right=n-1;
     while(left<right){
        if(arr[left]==1 && arr[right]==0){
            swap(arr,left,right);
            left++;
            right--;
        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
     }
    }
    
    //with 2 loops
    static void sortZeroOnes(int [] arr){
    
        int zeros=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
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
        System.out.println("sorted array");
        // sortZeroOnes(arr);
        sortZeroOnes1(arr);
        printArray(arr);
        sc.close();
    }
}
