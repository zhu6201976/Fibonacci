
import java.util.Scanner;
/**
���10��쳲�������Fibonacci�����У�1 1 2 3 5 8 13 21 34 55��
���ص㣺��1,2������ֵΪ1���ӵ���������ʼ����������ǰ��������֮�ͣ�
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1 = 1;
		int number2 = 1;
		int numberNext = 0;// ������һ����
		System.out.print(number1+"\t"+number2+"\t");
		for(int i=1;i<=8;i++){
			numberNext = number1 + number2;
			number1 = number2;
			number2 = numberNext;
			System.out.print(numberNext+"\t");
		}
		System.out.println();
	
	}
}