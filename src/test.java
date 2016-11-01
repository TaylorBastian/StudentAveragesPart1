import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sf = new Scanner(new File("src\\StudentScores.txt"));
		String[] a = new String[1000];
		int maxIndx = -1;
		while (sf.hasNext()) {
			maxIndx++;
			a[maxIndx] = sf.nextLine();
		}
		sf.close();

		int total = 0;
		int num = 0;
		double average;

		for (int i = 0; i <= maxIndx; i++) {
			Scanner sc = new Scanner(a[i]);
			System.out.print(sc.next() + ", average = ");
			while (sc.hasNextInt()) {
				total += sc.nextInt();
				num++;
			}
			average = (double) total / num;
			System.out.println(Math.round(average));
		}

	}

}
