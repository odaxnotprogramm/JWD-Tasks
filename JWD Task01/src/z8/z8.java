package z8;

import java.util.Scanner;

public class z8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива : ");
        int n = in.nextInt();
        System.out.print("Введите число k : ");
        int k = in.nextInt();
        int sum = 0;
        int a[] = new int[n];
        System.out.print("Введите массив : ");
        for(int i = 0;i < n;i++){
            a[i] = in.nextInt();
            if(a[i] % k == 0) sum += a[i];
        }
        System.out.println("Сумма всех чисел массива кратных k : " + sum);
    }
}
