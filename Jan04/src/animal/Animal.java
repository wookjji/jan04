package animal;

public abstract class Animal {
	protected int age;
	protected String name;
	//추상 메소드로 변신
	public abstract void sound();//바디가없어요
	
	public void thehagi() {
		
	}
	
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
	
	
}
