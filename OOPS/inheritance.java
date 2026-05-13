public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        
    }

    
}
//Base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal {
    int fins;
    void swin(){
        System.out.println("swins in water");
    }

}
