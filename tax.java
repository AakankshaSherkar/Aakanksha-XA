    public class tax
{
    int pan; String name; double taxincome;double tax;
    void input(int p, String n, double tax_income)
    {
        pan=p; name=n; taxincome=tax_income;
    }
    void calc()
    {
        if(taxincome<=100000)
        {
            tax=0;
        }
        else if((taxincome>=100001)&&(taxincome<=150000))
        {
            tax= ((taxincome-100000)*10)/100;
        }
        else if((taxincome>=150001)&&(taxincome<=250000))
        {
            tax=5000+((taxincome-150000)*20)/100;
        }
        else if(taxincome>250000)
        {
            tax=25000+((taxincome-250000)*30)/100;
        }
    }
    void display()
    {
        System.out.println("Pan number \t Name \t  TaxIncome \t   TaxRate");
        System.out.println(pan+"   \t"+name+"   \t"+taxincome+" \t"+tax);
    }
    public static void main(String args[])
    {
        tax obj=new tax();
        obj.input(2165791,"Aakanksha",500000);
        obj.calc();
        obj.display();
    }
}

        