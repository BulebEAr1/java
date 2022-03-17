package exam03;

public class VariableExchangExample {

	public static void main(String[] args) {	// main이라는 method block에서...
		int x = 3;	//로컬 변수: 해당 중괄호 블록 내에서만 사용가능 
		int y = 5;	//로컬 변수 y
		System.out.println("x:" + x + ",y:" + y);
		
		
		int temp = x;
		x = y; 	//5를 x에 저장
		y = temp;	//temp에 저장된 3을 y로 저장
		
		System.out.println("x:" + x + ",y:" + y); 	//x와 y 값 서로 바뀌어서 저장됨

	}

}
