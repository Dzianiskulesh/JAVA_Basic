import java.util.Scanner;

public class task_4 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	System.out.println("������� ���������� �����");//������ �������
	int n = scan.nextInt();
	int i = 0;
	int [] array = new int[n];
	System.out.println("������� �����"); //�������� ������� 
	for (i = 0; i < n; i++ ){
		array [i] = scan.nextInt();
	}
	
	int a = 0; // ���-�� ����� > 15 ��� < 2
	int sum = 0; // ����� �����, ������� ������� �� 5 � �������� 4 
	
	for (i = 0; i < n; i++){
		if ((array [i] > 15) || (array [i] < 2)) 
			a++;
	}
	
	System.out.println("���-�� ����� > 15 ��� < 2:" +a);
	
	for (i = 0; i < n; i++){
	if (array [i]%5 == 4);
	sum = sum+array[i];
	}
	System.out.println("����� �����, ������� ������� �� 5 � �������� 4:" +sum);
}
}