package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ĭ�� �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		jumpCase(n);

	}

	public static int jumpCase(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]);
		}
		System.out.println(arr[n]);
		return arr[n];

	}
}