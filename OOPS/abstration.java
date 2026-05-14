public class abstration {
    public static void main(String[] args) {
      Mustang myHorse = new Mustang();
      //Animal ->Horse -> Mustang 

        // animal a = new  Animal(); // cannot create object of abstract class
        
    }
    
}


abstract class  Animal {
    String color;
    Animal(){
       System.out.println("animal constructor called");

    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}
class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void  walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called");
    }
    void changeColor(){
        color = "black";
    }
}
class Chicken extends Horse {

        void changeColor(){
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}