import java.util.Scanner; 

public class task_9 {
	public static void main (String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������� ������ ���������� R");
	int R = scan.nextInt();
	double C = 2*Math.PI * R;
    double S = Math.PI * R * R;
	
	System.out.println("����� ����������:" +C);
	System.out.println("������� �����:" +S);
}
}