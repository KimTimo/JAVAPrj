

import java.util.*;

public class Calc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		String operand = input.next();
		
		System.out.print("숫자 2개를 입력하세요: ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		if(operand=="+") {
			System.out.println(num1+ "+" + num2+ "=" +(num1+num2));
		}
		else if(operand=="-") {
			System.out.println(num1+ "-" + num2+ "=" +(num1-num2));
		}
		else if(operand=="*") {
			System.out.println(num1+ "*" + num2+ "=" +(num1*num2));
		}
		else if(operand=="/") {
			if (num2==0) {
				System.out.println("0을 나눌 수는 없습니다");
			}
			else{
				System.out.println(num1+ "/" + num2+ "=" +(num1/num2));
			}
		}
	}

}