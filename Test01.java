package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		isHarshad(num);
		System.out.println();

	}

	public static void isHarshad(int num1) {
		int ten = 10;
		int tmp = num1; //입력값 tmp에 저장
		int j = 0;
		for (int i = 1; i <= num1; i++) { //자릿수 지정하는 포문
			if (ten > num1) {
				j = i;
				break;
			}
			ten *= 10;
		}
		int[] arr = new int[j]; // 이전 포문에 나왔던 i의 수를 j에 대입
		for (int i = 0; i < arr.length; i++) { 
			arr[i] = num1 % 10;  //배열에 num1%10의 나머지수를 저장
			num1 = num1 / 10; //num1에 num1/10의 몫값을 대입

		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + arr[i + 1];  //배열 자리값을 더해 sum에 대입

			if (tmp % sum == 0) { // tmp값과 sum을 나눈 나머지가 영이면 참, 아니면 거짓
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		}

	}
}