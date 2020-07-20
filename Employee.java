class Employee
{
    double basicpay, DA, pro_fund, net_pay ,gross_pay,HRA;
    Employee(double basic_pay)
    {
        basicpay=basic_pay;
    }
    void calc()
    {
        DA=(25*basicpay)/100;
        HRA=(15*basicpay)/100;
        pro_fund=(8.33*basicpay)/100;
        net_pay= basicpay+DA+HRA;
        gross_pay=net_pay-pro_fund;
    }
    void display()
    {
        System.out.println("Dearness Allowances: "+DA);
        System.out.println("House Rent Allowances: "+HRA);
        System.out.println("Provident Fund: "+pro_fund);
        System.out.println("Net pay: "+net_pay);
        System.out.println("Gross pay: "+gross_pay);
    }
    public static void main(String args[])
    {
        Employee obj=new Employee(30000);
        obj.calc();
        obj.display();
    }
}