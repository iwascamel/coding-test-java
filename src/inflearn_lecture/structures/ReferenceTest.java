package inflearn_lecture.structures;

class A{
    int height;
    A(int height){
        this.height=height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

public class ReferenceTest {
    public static void main(String[] args) {
        A a = new A(180);
        A b = new A(170);
        A c;

        c=a;
        c.setHeight(2000);
        System.out.println(a.getHeight());
    }
}
