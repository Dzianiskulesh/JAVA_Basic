package tasks;

import java.util.Scanner;

public class less01_task7 {
	public static void main (String []args) {
	
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter a and b");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		if (a>b) {
			
			System.out.println("Enter c");
			c = scan.nextInt ();
			int sum1 = b+c;
			System.out.println ("Amount b+c = " +sum1);
				}
						
		else if (a==b) 
	System.out.println("Finish");
		
		int sum2 = a+b+c;
		
	 if (a<b) {
		 System.out.println("Enter c");
			c = scan.nextInt ();
		System.out.println("Amount a+b+c = " +sum2);
		System.out.println("Happy New Year!!!");
		}
}
}
/*��������� ������ ��� ����� a � b, ���� � > b, �� ��������� ������ ������ ����� � �
������� ����� b+c. ���� �=b, �� ��������� �������� ����� �������. ���� �<b, ��
��������� ������ ������ ����� �, ������� ����� a+b+c, ������� �� ����� �����
a+b+c � ����� ������ ���!�.*/