public class NonParameterized {
        public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("shivasai");
        Student s3 =new Student(123);
        Student s3 = new Student("jeevan",567);
        //Student s3 = new Student("jeevan",567);

    
        
    }
    
}
class Student{
    String name;
    int roll;


    // Student(){
    //    System.out.println("constructor is called...");
    // }


    Student(string name){
        this.name = name;
    }
    Student(int roll){
        this.roll =roll;
    }
    
}
