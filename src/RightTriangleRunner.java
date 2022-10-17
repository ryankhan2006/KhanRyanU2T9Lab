public class RightTriangleRunner {
    public static void main (String[] args) {
        RightTriangle triangle1= new RightTriangle(3,4);
        RightTriangle triangle2= new RightTriangle(6.5,10.7);
        double hypotenuse1= triangle1.hypotenuse();
        double hypotenuse2= triangle2.hypotenuse();
        System.out.println("Hypotenuse of Triangle 1: " + hypotenuse1 + "\n" + "Hypotenuse of Triangle 2: " + hypotenuse2);
    }
}
