import java.util.Scanner;

  

public class SecondLarge {
    static int findMaxEle(int[] arr){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }
    return mx;
  }

  static int findSecondMaxEle(int[] arr){
      int mx=findMaxEle(arr);
      for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
      }
      int SecondLarge=findMaxEle(arr);

      return SecondLarge;
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
     
                
         System.out.println( " second large element :- "+findSecondMaxEle(arr));
         sc.close();


    }
}
