import java.util.ArrayList;
import java.util.Collections;

public class LessonArray{
    
    
public static void main(String[] args){
    ArrayList<Integer> age=new ArrayList<Integer>();
    age.add(45);
    age.add(56);
    age.add(55);
    age.add(23);
    age.add(0,59);
Collections.sort(age);
for(Integer i:age){
System.out.println(i);
}

System.out.println(age.get(3));
System.out.println(age.size());
}

}
    


    

