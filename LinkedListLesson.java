import java.util.LinkedList;

public class LinkedListLesson {
    public static void main(String[] args) {
    
    
    LinkedList<String> studentName=new LinkedList<String>();
    studentName.add("cleopas"); 
    studentName.add("namaswa");
    studentName.addFirst("wali");
    for(String i:studentName){
        System.out.println(i);
    }
    ;
}
}
