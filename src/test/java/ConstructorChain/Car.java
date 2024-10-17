package ConstructorChain;

public class Car {

    String Name;
    String Color;
    int Year;

    Car(){
    }

    public Car(String name,String color, int yr){
        this.Name = name;
        this.Color = color;
        this.Year = yr;
    }

    public static void main(String[] args){

        Car mycar = new Car();
        System.out.println(mycar.Name);
        System.out.println(mycar.Color);
        System.out.println(mycar.Year);

        Car mycar1 = new Car("Nexon","green", 2023);

        System.out.println(mycar1.Name);
        System.out.println(mycar1.Color);
        System.out.println(mycar1.Year);

    }
}
