package overriding;

import java.util.ArrayList;

public class Ferrari extends ArrayList<String>{

	private int year;
	
	public Ferrari(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void speed() {
		System.out.println(year + "년식 페라리 속도 : 300km");
	}

//	@Override
//	public boolean add(String e) {
//		System.out.println("내가만든 add method 입니다.");
//		System.out.println("저장따윈 하지 않습니다.");
//		return super.add(e);
//	}
//	
	
}
