import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> set = new TreeSet<>();
		set.add(new Dog(10));
		set.add(new Dog(40));
		set.add(new Dog(30));
		set.add(new Dog(20));
		
		System.out.println(set);
	}

}
class Dog implements Comparable<Dog>{
	int size;
	public Dog(int size) {
		this.size = size;
	}
	
	public String toString() {
		return size + "";
	}

	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return size - o.size;
	}
}
