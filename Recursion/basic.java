public class basic {
     
    static void PrintInc(int n){
        if(n==0){
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");

      
    }
    static void Printdec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        Printdec(n-1);


    }


    public static void main(String[] args) {
        PrintInc(10);
        System.out.println();
        System.out.println("second ");
        Printdec(10);
    }
}