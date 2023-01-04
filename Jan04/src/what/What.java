package what;

public class What {
	public static void main(String[] args) {

		Human h1 = Human.getInsetance();
		Human h2 = Human.getInsetance();
		Human h3 = Human.getInsetance();
		Human h4 = Human.getInsetance();
		System.out.println(h1 == h2);
	}
}

class Human {
	private static Human human = new Human();

	private Human() {

	}

	public static Human getInsetance() {
		return  human;
	}
}