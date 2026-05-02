public class factorials {    


public static int multiply(int a ,int b) {
    int product = a * b;
    return product;

}

public static int factorial(int n) {
    int f = 1;

    for(int i = 1; i<= n; i++){
        f =f * i;

    }
    return f;  //factorial of n

    }


    public static void main(String[] args) {
      System.out.println( factorial(4));

    
       
       
    }
    
}
