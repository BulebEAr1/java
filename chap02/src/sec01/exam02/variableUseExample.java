package sec01.exam02;

public class variableUseExample {

	public static void main(String[] args) {
		int hour=3;
		
		int minute=5;
		
		System.out.println(hour+"시간"+minute+"분"); //출력문1
		
		int totalMinute=(hour*60)+minute; 
		
		System.out.println("총"+totalMinute+"분"); //출력문2
	}

}
