import java.util.ArrayList;


public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //print arrylist
        System.out.println(l1);
       for(int i=0;i<l1.size();i++){
        System.out.println(l1.get(i));
       }


      //adding at index

       l1.add(1,100);
        System.out.println(l1);


     // modify elements at index
     l1.set(1,10);
     System.out.println(l1);

     // remove at index

     l1.remove(1);
     System.out.println(l1);

     // remove by elements always return boolean (true false)

     l1.remove(Integer.valueOf(7));
     System.out.println(l1);

     //checking if elements exists
     boolean ans=l1.contains(Integer.valueOf(6));
     System.out.println(ans);

     //if you dont specify class, you can put anything
    //   ArrayList l=new ArrayList();
    //   l.add("tabrez");
    //   l.add(1);
    //   l.add(true);
    //   System.out.println(l);

     

       
    }
}