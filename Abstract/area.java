package Abstract;

abstract class Shape{
    abstract void area(int a);
}

class Circle extends Shape{
    void area(int a){
        System.out.println(3.14*a*a);
    }
}

class Square extends Shape{
    void area(int a){
        System.out.println(a*a);
    }

}

public class area {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.area(2);
        Shape obj1 = new Square();
        obj1.area(2);
    }
}
