public class Students{
    String studName;
    int studId;
    int studAge;
    
    void dispalyProperties(){
        System.out.print(studName);
    }
    public static void main(String[] args) {
        Students student=new Students();
        student.studName="cleopas";
        System.out.println(student.studName);
        
    }
}