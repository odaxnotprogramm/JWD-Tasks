package z1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите 4-ёхзначное число : ");
		int a = in.nextInt();
		System.out.println("Ответ : " + (a / 1000 + (a / 100) % 10 == a % 10 + (a % 100) / 10));
	}
}
