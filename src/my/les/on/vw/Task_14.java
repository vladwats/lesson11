package my.les.on.vw;

public class Task_14 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 8;
		int[][] mas = new int[n][n];
		mademas(mas);
		printmas(mas);

	}

	public static void mademas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[mas.length - 1 - i][i] = mas.length - i;
		}
	}

	
	public static void printmas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
