import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	System.out.println("������� ���������� ����");//������ �������
	int count = scan.nextInt();
	int i = 0; 
	int[] array = new int [count];
	System.out.println("������� �����"); //�������� ������� 
	for (i = 0; i < count; i++ ) {
		array [i] = scan.nextInt();
	}
		
	int chet = 0; //������ �����
	
	for (i = 0; i < count; i++) {
		if (array [i]%2 == 0) {
			chet++;
		}
	System.out.println("������ ����:" + chet);
		
	int sum = 0; //����� ������� ���� 
	
	for (i = 0; i < count; i++) {
		if (array [i]%3 == 0) {
			sum = sum + array [i];
		}
	}
	System.out.println("����� ���� ������� ����:" + sum);
	
	int mod3 = 0; // ������ <3
	
	for (i = 0; i < count; i++)	{
		if (Math.abs(array [i]) < 3);{
			mod3++;
		}
	}
	System.out.println("���������� ����, ������ ������� <3:" + mod3);

		}
	}
}