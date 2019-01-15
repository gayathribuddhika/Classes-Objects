
public class Student {
    int id;
    String name;
    int age;
    
    public static void main(String[] args) {
        Student tom = new Student();
        tom.id=1;
        tom.name="Tom";
        tom.age=12;
        System.out.println(tom.id+"."+tom.name+" is "+tom.age+" years old.");
        
        Student jack = new Student();
        jack.id=2;
        jack.name="Jack";
        jack .age=14;
        System.out.println(jack.id+"."+jack.name+" is "+jack.age+" years old.");
    }
    
}