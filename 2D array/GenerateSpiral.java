
import java.util.Scanner;

public class GenerateSpiral {


    static void PrintMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] printSpiralOrder(int n){
        int[][] matrix =new int[n][n];
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int current=1;
        while (current<=n*n) {
            //topRow => left col to right col
            for(int j=leftCol;j<=rightCol && current<=n*n;j++){
                matrix[topRow][j]=current++;
                
            }
            topRow++;


            //rightCol => toRow to bottom row

            for(int i=topRow;i<=bottomRow && current<=n*n;i++){
                matrix[i][rightCol]=current++;
                
            }
            rightCol--;

            //bottomRow => rightcol to leftcol
            for(int j=rightCol;j>=leftCol  && current<=n*n;j--){
                matrix[bottomRow][j]=current++;
                
            }
            bottomRow--;

            //LeftRow => bottom row to top row
             for(int i=bottomRow;i>=topRow  && current<=n*n;i--){
                matrix[i][leftCol]=current++;
            
            }
            leftCol++;

            
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int[][] matrix=printSpiralOrder(n);

        PrintMatrix(matrix);
        

        sc.close();
    }
}
