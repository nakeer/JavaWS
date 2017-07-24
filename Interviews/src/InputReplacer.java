import java.util.*;

public class InputReplacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "[[0,0,1,0,0],[0,0,0,0,0],[0,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]]";
		
		System.out.println(input.replace("[", "{").replace("]", "}"));
		
	}

}
