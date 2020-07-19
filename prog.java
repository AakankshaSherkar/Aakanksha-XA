class prog
{
    int id;
    String name;
    static String schoolname="podar";
     prog(int id , String name)
    {
        this.id=id;
        this.name=name;
    }
     void display()
    {
     System.out.println(id+""+name+""+schoolname);
    }
    public static void main(String args[])
    {
        prog obj= new prog(1,"aakanksha ");
        obj.display();
        prog obj2= new prog(2,"aasha ");
        obj2.display();
    }
}
        
    

    
    
    