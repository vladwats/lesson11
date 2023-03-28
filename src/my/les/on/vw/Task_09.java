package my.les.on.vw;

import java.util.Random;

public class Task_09 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

		int n = 7;
		int[][] mas = new int[n][n];

		mademas(mas);
		printmas(mas);
		System.out.println();
		
		printElementsDiagonal(mas);
		System.out.println();
		printElementsDiagonalTwo(mas);

	}

	//////
	public static void mademas(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
	}

	//////
	
	public static void printmas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

	//////
	// элементы диагонали из верхнего левого угла по нижний правый угол
	
	public static void printElementsDiagonal(int[][] mas) {     
		System.out.print("Elements on the diagonally: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][i] + " ");
		}
	}
	//////
	// элементы диагонали из верхнего правого угла по нижний левый угол
	public static void printElementsDiagonalTwo(int[][] mas) {
		System.out.print("Elements on the another diagonally: ");
		for (int i = mas.length - 1, j = 0; i >= 0 && j < mas[i].length; i--, j++) {
			System.out.print(mas[j][i] + " ");
		}
	}
}
