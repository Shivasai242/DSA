package pattern2;

public class FLOYDSTriangle {
    public static void floyds_triangle(int n) {
        //outer
        int counter = 1;
        for(int i = 1; i <= n; i++){
            //inner --how may times will counter be printed
            for(int j = 1; j <= i ; j++){
                System.out.print(counter+" ");
                counter++;
                

            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }

    
}
