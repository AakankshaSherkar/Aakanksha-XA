class Overloading1
{
    void add(int a,int b)
    {
        System.out.println("Addition of Integer"+(a+b) );
    }
     void add(char a,char b)
    {
        System.out.println("Addition of Character"+ (a+b));
    }
     void add (float a,float b)
    {
       System.out.println("Addition of float"+ (a+b));
    }
    void add(double a,double b)
    {
        System.out.println("Addition of double"+(a+b));
    }
    public static void main()
    {
        Overloading1 obj=new Overloading1();
        obj.add(2,5);
        obj.add('A','B');
        obj.add(6.5f,3.7f);
        obj.add(98,4.7);
    }
}
        
