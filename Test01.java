package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		isHarshad(num);
		System.out.println();

	}

	public static void isHarshad(int num1) {
		int ten = 10;
		int tmp = num1; //�Է°� tmp�� ����
		int j = 0;
		for (int i = 1; i <= num1; i++) { //�ڸ��� �����ϴ� ����
			if (ten > num1) {
				j = i;
				break;
			}
			ten *= 10;
		}
		int[] arr = new int[j]; // ���� ������ ���Դ� i�� ���� j�� ����
		for (int i = 0; i < arr.length; i++) { 
			arr[i] = num1 % 10;  //�迭�� num1%10�� ���������� ����
			num1 = num1 / 10; //num1�� num1/10�� ���� ����

		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + arr[i + 1];  //�迭 �ڸ����� ���� sum�� ����

			if (tmp % sum == 0) { // tmp���� sum�� ���� �������� ���̸� ��, �ƴϸ� ����
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		}

	}
}