package abstract01;

public class Ironman extends Hero{
	String javis;
	
	public void callJavis() {
		System.out.println("javis, 슈트만들어.");
	}
	@Override
	public void attack() {
		System.out.println("레이저빔 비용");

	}

	@Override
	public void defense() {
		System.out.println("아이안맨 갑옷막기");

	}

}
