package OOPS;

public class PolyMorphism
{
    public int add(int x,int y)
    {
        return x+y;
    }
    public int add(int x,int y,int z)
    {
        return x+y+z;
    }
    public int add(double x,int y)
    {
        return (int)x+y;
    }
    public int add(int x,double y)
    {
        return x+(int)y;
    }

}
class Test2
{
    public static void main(String[] args)
    {
        PolyMorphism obj = new PolyMorphism();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10.5,20));
        System.out.println(obj.add(10,20.5));
    }
}
