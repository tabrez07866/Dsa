import java.util.Scanner;

public class printSpiral {


    static void PrintMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix,int r,int c){
         
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalEle=0;
        while (totalEle<r*c) {
            //topRow => left col to right col
            for(int j=leftCol;j<=rightCol && totalEle<r*c;j++){
                System.out.print(matrix[topRow][j] +" ");
                totalEle++;
            }
            topRow++;


            //rightCol => toRow to bottom row

            for(int i=topRow;i<=bottomRow && totalEle<r*c;i++){
                System.out.print(matrix[i][rightCol] +" ");
                totalEle++;
            }
            rightCol--;

            //bottomRow => rightcol to leftcol
            for(int j=rightCol;j>=leftCol  && totalEle<r*c;j--){
                System.out.print(matrix[bottomRow][j] +" ");
                totalEle++;
            }
            bottomRow--;

            //LeftRow => bottom row to top row
             for(int i=bottomRow;i>=topRow  && totalEle<r*c;i--){
                System.out.print(matrix[i][leftCol] +" ");
                totalEle++;
            }
            leftCol++;

            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int r=sc.nextInt();
        System.out.println("enter the coloumn");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
     
        System.out.println ("enter the elements:-");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Input Matrix ");
        PrintMatrix(arr);

        System.out.println("Spiral order ");
        printSpiralOrder(arr,r,c);

        sc.close();
    }
}
