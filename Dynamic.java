class Animal
{

	void eat()
	{
		System.out.println("Animal is eating \n");
	}
}

class Dog extends Animal{

	void eat()
	{
		System.out.println("Dog is eating \n");      // this method is assessed during runtime over parent class method (i.e Dynamic binding)

	}


}
class Dynamic{

	public static void main(String[] args)
	{

		Dog dog = new Dog();
		dog.eat();
	}
}