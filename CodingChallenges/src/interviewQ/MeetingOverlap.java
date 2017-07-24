package interviewQ;

import java.util.*;

class Meetings {
	public int start, end;
	public Meetings(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return "["+start+","+end+"]";
	}
	
	public boolean isOverlapping(Meetings m) {
		if ( (m.start > this.start && m.start < this.end) || (m.end > this.start && m.end < this.end) ) {
			return true;
		} else return false;
	}
}

public class MeetingOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Meetings> ll = new ArrayList<>();
		
		ll.add(new Meetings(900,1100));
		ll.add(new Meetings(800,900));
		ll.add(new Meetings(0,100));
		ll.add(new Meetings(2330,2400));
		ll.add(new Meetings(1159,1359));
		
		Meetings checkthis = new Meetings(801,902);
		for(int i = 0 ;i < ll.size() ; i++) {
			if(ll.get(i).isOverlapping(checkthis)) {
				System.out.println("YEs");
				break;
			}
		}
		
	}

}
