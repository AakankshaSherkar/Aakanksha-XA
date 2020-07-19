class Overloading2
{
    void area(int side)
    {
        double square= side*side;
        System.out.println(square);
    }
    void area(double length,double breadth)
    {
        double rectangle=length*breadth;
        System.out.println(rectangle);
    }
    void area(double radius)
    {
        double pi=3.14;
        double circle= pi*(radius*radius);
        System.out.println(circle);
    }
     public static void main()
    {
        Overloading2 obj=new Overloading2();
        obj.area(25);
        obj.area(6,8);
        obj.area(6.1);
    }
}