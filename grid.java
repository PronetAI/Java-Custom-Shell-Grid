import java.util.Scanner;

public class Grid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int grid = sc.nextInt();
		while (grid>15) {
			System.out.println("The maximum value is 15");
			grid=sc.nextInt();
		}
		for (int i=0;i<grid;i++){
			System.out.println("");
			for (int j=0;j<grid;j++) {
				System.out.print("*");
			}
		}
	}
}
