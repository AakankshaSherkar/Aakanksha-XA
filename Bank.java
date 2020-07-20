class Bank 
{
    String name,acc_type; long acc_num;double acc_balance;
    Bank()
    {
        name="";
        acc_num=0;
        acc_type="";
        acc_balance=0;
    }
    void init(String n,String type,long num,double balance)
    {
        name=n;
        acc_type=type;
        acc_num=num;
        acc_balance=balance;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+acc_num);
        System.out.println("Account Type: "+acc_type);
        System.out.println("Balance Amount: "+acc_balance);
    }
    void deposit(double amount)
    {
        acc_balance+=amount;
        System.out.println("The amount deposited is "+amount);
        System.out.println("The total balance in the account is "+acc_balance);
    }
    void withdraw(double amount)
    {
        if(amount<=acc_balance)
        acc_balance-=amount;
        System.out.println("The amount of withdrawal is "+amount);
        System.out.println("The remaining balance in the account is "+acc_balance);
    }
    public static void main(String args[])
    {
        Bank obj=new Bank();
        obj.init("Aakanksha","Savings",2165791,10000);
        obj.display();
        obj.deposit(2000);
        obj.withdraw(3000);
    }
}
 