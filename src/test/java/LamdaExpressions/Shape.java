package LamdaExpressions;

interface Shape {
    void draw();
}

class rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class: draw() method");
    }
}

class square implements Shape{

    @Override
    public void draw() {
        System.out.println("square class: draw() method");
    }
}

class circle implements Shape{

    @Override
    public void draw() {
        System.out.println("circle class: draw() method");
    }
}

class lamdaExp{

    public static void main(String[] args) {

        passLamdaAsParam(() -> System.out.println("Rectangle class: draw() method"));
        passLamdaAsParam(() -> System.out.println("Square class: draw() method"));
        passLamdaAsParam(() -> System.out.println("Circle class: draw() method"));
    }

    private static void passLamdaAsParam(Shape shape){
        shape.draw();
    }
}

