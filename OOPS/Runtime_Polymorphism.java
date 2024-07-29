package OOPS;

class Runtime_Polymorphism
{
    public void move()
    {
        System.out.println("Any vehicle can move");
    }
}
class Bike extends Runtime_Polymorphism
{
    public void move()
    {
        System.out.println("Bike can move");
    }
}
class Car extends Runtime_Polymorphism
{
    public void move()
    {
        System.out.println("Car can move");
    }
}
class Testt
{
    public static void main(String[] args) {
        Runtime_Polymorphism obj= new Bike();

        obj = new Runtime_Polymorphism();
        obj.move();


    }
}
