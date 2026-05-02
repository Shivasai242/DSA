public class product {
    public static void printHelloWorld(){
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    

}

public static int calculateSum(int num1 ,int num2) {  //parameters or formal parameters
        int sum = num1 +num2;
        return sum;

}


public static  void swap (int a, int b){
    //swap

   int temp = a;
   a = b;
   b = temp;

    

}
public static int multiply(int a ,int b) {
    int product = a * b;
    return product;

}


    public static void main(String[] args) {
  
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);

    
       
       
    }
    
}
