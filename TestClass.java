interface PI1
{
    // default method
    default void show()
    {
        System.out.println("Default PI1");
    }
}
 
interface PI2
{
    // Default method
    default void show()
    {
        System.out.println("Default PI2");
    }
}
 class abstract Animal{
    void abstract eat();
 }
// Implementation class code
class TestClass implements PI1, PI2 extends Animal
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of PI1 interface
        PI1.super.show();
 
        // use super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
    }

    public void eat()
    {
        System.out.println("Animal is eating \n");
    }
 
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
    }
}
