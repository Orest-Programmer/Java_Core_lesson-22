package ua.lviv.lgs.task2;

public class App {

	public static void main(String[] args) {
		Frog frog = new Frog();
		
		frog.eat.doSmth();
		frog.sleep.doSmth();
		frog.swim.doSmth();
		frog.walk.doSmth();
	}

}

@FunctionalInterface
interface Amphibia{
	void doSmth();
}

class Frog{
	Amphibia eat = () -> System.out.println("I`m Frog and I want to eat");
	Amphibia sleep = () -> System.out.println("I`m Frog and I want to sleep");
	Amphibia swim = () -> System.out.println("I`m Frog and I want to swim");
	Amphibia walk = () -> System.out.println("I`m Frog and I want to walk");
}


