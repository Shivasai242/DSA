public class oops{
    public static void main(String[] args) {
        Pen p1 =new Pen(); //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("yellow");
        p1.color = "yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "shivasai";
        myAcc.setPassword("abcdef");
    }
}
class BankAccount{
    public String username;
    private String password;
     void setPassword(String pwd){
        password = pwd;

    }
}

class Pen{
    String color ;
    int tip ;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) /3;
    }
}


