namespace Question4
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            A a=new A();
            a.Print();

            B b=new B();
            b.Print();
        }
    }
    
    public class A
    {
        public virtual void Print()
        {
            System.Console.WriteLine("Virtual Print method from a");
        }
    }
 
    public class B:A
    {
        public override void Print()
        {
            System.Console.WriteLine("Override Print method from b");
        }
    }
}