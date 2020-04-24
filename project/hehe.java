import java.util.Scanner;
class yea{
	public static void main(String[] args){

		int angka, urutan, bagiangka, total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan Angka");
		angka = sc.nextInt();
		if (angka > 1){
			if (angka % 2 == 0){
				System.out.println("hasil = " + (angka + 3));
			}
			else if (angka % 2 == 1){
				System.out.println("hasil = " + (angka + 2));
			}
			else System.out.println("hasil = " + (angka + 1));
		}
		else if (angka == 0){
			System.out.println("Bilangan 0 adalah netral");
		}
		else if (angka <= 0){
			System.out.println("bilangan (-) tidak boleh");
		}
		else{
			System.out.println("hasil = " +  (angka + 1));

		
		
		}
	}
}

			
		