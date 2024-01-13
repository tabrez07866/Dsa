import java.util.Scanner;

public class Transpose {

    static void PrintArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void transpose1(int[][] arr,int r,int c){

        int[][] ans=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[j][i];
            }
        }
        PrintArray(ans);
      
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int r=sc.nextInt();
        System.out.println("enter the coloumn");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
     
        System.out.println("enter the elements:-");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        PrintArray(arr);  
        transpose1(arr,r,c);
        sc.close();  
     }
    }
