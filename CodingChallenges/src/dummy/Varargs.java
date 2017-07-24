package dummy;

public class Varargs {
	
	public static int varargsTest(int... args) {
		int total = 0;
		for(int i : args) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(varargsTest());
	}

}
