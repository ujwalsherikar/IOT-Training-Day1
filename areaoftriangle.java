package ujwal;

public class areaoftriangle {

    void area() {
        double base = 10;
        double height = 5;

        double a = 0.5 * base * height;

        System.out.println("Area of Triangle = " + a);
    }

    public static void main(String[] args) {
        areaoftriangle d = new areaoftriangle();
        d.area();
    }
}
