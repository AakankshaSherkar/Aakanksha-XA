class area3
{
    double len,b, ans;
    void init(double length,double breadth)
    {
        len=length;
        b=breadth;
    }
    double calc()
    {
        ans=len*b;
        return ans;
    }
    public static void main()
    {
        area3 obj= new area3();
        obj.init(10,20);
        double result=obj.calc();
        System.out.println(result);
    }
}

        

        
        
    