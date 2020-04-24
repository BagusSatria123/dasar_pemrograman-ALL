import java.util.Scanner;
class yea{
	public static void main(String[] args){

		int angka, urutan, bagiangka, total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan Angka");
		angka = sc.nextInt();

		bagiangka = angka % 2;

		if (bagiangka == 0){
			total = angka + 3;
			System.out.println("maka deret ke : " + angka + "adalah" + total);
		}else if (bagiangka == 1 && angka > 1){
			total = angka + 2;
			System.out.print("maka deret ke" + angka + "adalah" + total);
		}
		else{
			total = angka + 1;
			System.out.println("maka deret ke" + angka + "adalah" + total);

		}
		

	}
}