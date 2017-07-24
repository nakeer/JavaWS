package enums;

enum Day {
	M(10),
	T(20),
	W(30),
	Th(40),
	F(50),
	Sa(60),
	S(70);
	
	private int value;
	
	Day(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class EnumDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Day.M.getValue());

	}

}
