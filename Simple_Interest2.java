class Simple_Interest2
{
    double P,time ,rate,ans;
    void init()
    {
        P=2000;
        rate=2.5;
        time=5;
    }
    void calc()
    {
        ans=(P*rate*time)/100;
    }
    void display()
    {
        System.out.println(ans);
    }
}
    