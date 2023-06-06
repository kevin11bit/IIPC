abstract class Animal{
	String name;
	int age;
	abstract void makeSound();
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Sound made by Dog = Bark");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("Sound made by Cat = Meow");
	}
}
public class Animals {
	public static void main(String args[]) {
		Dog d1 = new Dog();
		d1.age=7;
		System.out.println("Dog's age = "+d1.age);
		d1.name="Bruno";
		System.out.println("Dog's name = "+d1.name);
		d1.makeSound();
		Cat c1 = new Cat();
		c1.age=5;
		System.out.println("Cat's age = "+c1.age);
		c1.name="Luna";
		System.out.println("Cat's name = "+c1.name);
		c1.makeSound();
	}
}
