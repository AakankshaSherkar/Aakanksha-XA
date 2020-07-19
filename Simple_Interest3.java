class Simple_Interest3
{
    double P,T,R,ans;
    void init(double Principal,double Rate,double Time)
    {
        P=Principal;
        R=Rate;
        T= Time;
    }
    double calc()
    {
        ans=(P*R*T)/100;
        return ans;
    }
    public static void main()
    {
        Simple_Interest3 obj= new Simple_Interest3();
        obj.init(2000,2.5,5);
        double result=obj.calc();
        System.out.println(result);
    }
}