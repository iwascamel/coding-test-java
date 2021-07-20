package ssafy.hw_210719;

class Circle{
    private double radius;

    private final static double PI = 3.141592;

    public double getCircleArea(){
        return radius * radius * PI;
    }

    public Circle(double radius){
        this.radius=radius;
    }

}

public class CircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("반지름이 5Cm인 원의 넓이는 약 " + circle.getCircleArea() + "cm2 입니다");
    }
}


