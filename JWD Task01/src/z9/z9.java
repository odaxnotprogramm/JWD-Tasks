package z9;

import java.util.Scanner;

public class z9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер первого массива : ");
        int n = in.nextInt();
        System.out.print("Введите размер второго массива : ");
        int m = in.nextInt();
        System.out.print("Введите число k : ");
        int k = in.nextInt();
        int sum = 0;
        int a1[] = new int[n];
        int a2[] = new int[m];
        int ans[] = new int[n + m];
        System.out.print("Введите первый массив : ");
        for(int i = 0;i < n;i++) a1[i] = in.nextInt();
        System.out.print("Введите второй массив : ");
        for(int i = 0;i < m;i++) a2[i] = in.nextInt();
        int j = 0;
        for(int i = 0;i < k;i++,j++) ans[j] = a1[i];
        for(int i = 0;i < m;i++,j++) ans[j] = a2[i];
        for(int i = k;i < n;i++,j++) ans[j] = a1[i];
        System.out.print("Итоговый массив : ");
        for(int i = 0;i < n + m;i++) System.out.print(ans[i] + " ");
    }
}
