package exam03;

public class VariableExchangExample {

	public static void main(String[] args) {	// main�̶�� method block����...
		int x = 3;	//���� ����: �ش� �߰�ȣ ��� �������� ��밡�� 
		int y = 5;	//���� ���� y
		System.out.println("x:" + x + ",y:" + y);
		
		
		int temp = x;
		x = y; 	//5�� x�� ����
		y = temp;	//temp�� ����� 3�� y�� ����
		
		System.out.println("x:" + x + ",y:" + y); 	//x�� y �� ���� �ٲ� �����

	}

}
