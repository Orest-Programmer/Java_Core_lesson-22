package ua.lviv.lgs.task1;

public class App {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		dog.pt.voice();
		cat.pt.voice();
		cow.pt.voice();
	}
}

@FunctionalInterface
interface Pet{
	void voice();
}

class Dog{
	Pet pt = () -> System.out.println("I`m dog - Wof wof wof");
}

class Cat{
	Pet pt = () -> System.out.println("I`m cat - Mew mew mew");
}

class Cow{
	Pet pt = () -> System.out.println("I`m cow - Moo moo moo");
}