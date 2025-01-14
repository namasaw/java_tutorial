import java.util.HashSet;
import java.util.Iterator;

public class LessonHset {
    public static void main(String[] args) {
        
        HashSet<Integer> idNo=new HashSet<Integer>();
        idNo.add(42061189);
        idNo.add(41783098);
        idNo.add(42567748); 
        // System.out.println(idNo.contains(42061189));
        // System.out.println(idNo.contains(3568722));
        // for(Integer i:idNo){
        //     System.out.println(i);
        // }

        Iterator<Integer> it = idNo.iterator();
        // System.out.println(it.next());
        while(it.hasNext()){
           
        System.out.println(it.next()); 
        }
        


    }
    
}
