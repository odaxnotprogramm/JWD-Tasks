package z10;

import java.util.Scanner;

public class z10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы (n x n) : ");
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Ответ : ");
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                if(i % 2 == 0) arr[i][j] = 1 + j;
                else arr[i][j] = n - j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
