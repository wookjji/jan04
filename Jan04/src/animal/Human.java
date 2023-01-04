package animal;

public class Human extends Animal {
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	//add()
	int add(int num1, int num2){
		return num1 + num2;
	}

	@Override
	public void sound() {
		//super.sound();
		System.out.println("아.... 추움....");
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		
		Human.check = 5000;//static붙은 녀석들은 클래스명.변수명
		//human.check = 100;
		//Human.NUM = 15015;
		
		int result = human.add(15, 30);
		human.ssn = "주민번호";
		
	}
	public String getSsn() {
		return ssn;
	}
	
	public void setSSn(String Ssn) {
		ssn=ssn.replace("-","");
		if(ssn.length()>12) {
			this.ssn=ssn;
		}else {
		for(int i=ssn.length();i<13;i++) {
			System.out.print("*");
			
		}
		}
	}
	
}
