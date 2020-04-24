import java.util.Scanner;

public class Halo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int angka, hasil=0;

		System.out.print("Masukkan angka = ");
		angka=input.nextInt();

		if (angka%2 == 0&&angka>1) {
			hasil=angka+2;			
		}else if (angka == 1) {
			hasil=1;
		}else if (angka%4 == 1&&angka>3) {
			hasil=angka-1;
		}else if (angka%4 == 3&&angka>3) {
			hasil=angka+1;
		}else if (angka == 3) {
			hasil=angka+1;
		}
		System.out.print("Angka output adalah = "+hasil);
	}
}