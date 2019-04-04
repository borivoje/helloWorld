public class Main {

	public static void main(String[] args) {

		//1. Use strategy pattern when you want to define a class
		// that will have one behaviour that is similar to other behaviour in the list

		//2. When you want to use one of several behaviours dynamically

		Animal bird = new Bird();
		Animal dog = new Dog();

		System.out.println("Dog: " + dog.tryToFly());
		System.out.println("Bird: " + bird.tryToFly());
		System.out.println("Bird: " + bird.tryToFly());

		dog.setFlyingAbility(new CanFly());

		System.out.println("Dog: " + dog.tryToFly());

	}
}
