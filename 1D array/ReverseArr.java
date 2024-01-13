public class ReverseArr {

    static void Swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseArr(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j) {
            Swap(arr,i,j);
            i++;
            j--;
            
        }
    }
    static void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    reverseArr(arr);
    PrintArr(arr);
  }
}
