public class Animal implements FlyingType {

	public FlyingType flyingType;

	public Animal() {

	}

	public String tryToFly() {
		return flyingType.tryToFly();
	}

	public void setFlyingType(FlyingType ft) {

		flyingType = ft;
	}

}
