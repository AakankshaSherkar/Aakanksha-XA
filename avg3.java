class avg3
{
    double sub1,sub2,sub3,ans;
    void init(double maths,double english,double history)
    {
        sub1=maths;
        sub2=english;
        sub3=history;
    }
    double calc()
    {
        ans=(sub1+sub2+sub3)/3;
        return ans;
    }
    public static void main()
    {
        avg3 obj=new avg3();
        obj.init(75,94,87);
        double result=obj.calc();
        System.out.println(result);
    }
}
    
    
        