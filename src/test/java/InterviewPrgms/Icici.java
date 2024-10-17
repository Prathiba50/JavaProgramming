package InterviewPrgms;

interface bank{
    void withdraw();

    void update();
}


abstract class Icici implements bank {

    @Override
    public void withdraw() {
        System.out.println("'jdshjf");
    }


}

class color extends Icici{

    @Override
    public void update() {
        System.out.println("dshdua");
    }

    public static void main(String[] args) {
    Icici ic =  new color();
    }
}
