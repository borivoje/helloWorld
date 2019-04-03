public class Main {

	public static void main(String[] args) {

		Animal bird = new Bird();
		Animal dog = new Dog();

		System.out.println("Dog: " + dog.tryToFly());
		System.out.println("Bird: " + bird.tryToFly());

	}
}
