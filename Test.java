
import java.util.Scanner;
/**
输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。
（特点：第1,2两个数值为1，从第三个数开始，该数是其前面两个数之和）
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1 = 1;
		int number2 = 1;
		int numberNext = 0;// 保存下一个数
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