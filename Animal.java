public class Animal implements Flys {

	public Flys flyingType;

	public Animal() {

	}

	public String tryToFly() {
		return flyingType.tryToFly();
	}

	public void setFlyingAbility(Flys newFlyingObject) {
		flyingType = newFlyingObject;
	}

}
