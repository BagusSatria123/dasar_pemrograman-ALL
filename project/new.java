import java.util.Scanner;
class new{
	public static void main(String[] args){

		int angka, urutan, bagiangka, total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan Angka");
		angka = sc.nextInt();

		bagiangka = angka % 2;

		if (bagiangka == 0){
			total = angka + 3;
			System.out.println("maka deret ke : " + angka + "adalah" + total);
		}
	}
}