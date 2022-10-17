
public class CircleRunner {
    public static void main (String[] args) {
        Circle circle1= new Circle(5.0);
        String info1 =circle1.getInfo();
        System.out.println(info1);
        circle1.setRadius(9.2);
        String info2 = circle1.getInfo();
        System.out.println(info2);

    }
}
