public class CalculateAreaOverriding {
    static void calArea(int l,int r){
        System.out.println("Rectangle Area = "+l*r);
    }
    static void calArea(int l){
        System.out.println("Square Area = "+l*l);
    }
    static void calArea(double r){
        System.out.println("Circle Area = "+(3.14*r*r));
    }
    public static void main(String[] args) {
        calArea(1,2);
        calArea(3);
        calArea(2.15);
    }
}
