import java.util.*;

public class Bismillah{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int[] list = new int[];
		System.out.println();
		System.out.println("==================Final Project==================");
		System.out.println();
		System.out.println("NAMA\t\t : MUHAMMAD ROYYAN ZAMZAMI");
		System.out.println("NIM\t\t : 1841720053");
		System.out.println("KELAS\t\t : TI-1D");
		System.out.println("NO.ABSEN\t : 25");
		System.out.println();
		System.out.println("==================Final Project==================");
		System.out.println();
		Pilihan(1);
	}

	static void Pilihan(int pilih){
		Scanner sc = new Scanner(System.in);
		Random angkaRandom = new Random();
		int cicilan, hp, laptop, jenishp, jenislaptop, hargahp, hargalaptop, bunga, lama, nokre, maneh = 1;
		int oppo=1200000, xiaomi=2200000, vivo=1350000;
		int acer=5400000, asus=5000000;

		nokre = 1 + angkaRandom.nextInt(10000000);

		while (maneh == 1){
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("|||||||Toko Kredit HAMBA ALLAH||||||||");
			System.out.println("--------------------------------------");
			System.out.print("Masukkan Nama Anda\t : ");
			String n = sc.next();
			System.out.print("Masukkan Nomer HP\t : ");
			String num = sc.next();
			System.out.println("--------------------------------------");
			System.out.print("1. HP\n2. Laptop\n");
			System.out.println("--------------------------------------");
			System.out.print("Apa yang ingin anda Kredit\t\t : ");
			pilih = sc.nextInt();
			System.out.println("--------------------------------------");

		//HP
		if (pilih == 1) {
			hpjes(1);
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.print("1. 6 Bulan\n2. 12 Bulan\n");
			System.out.println("--------------------------------------");	
			System.out.print("Pilih berapa lama anda mengangsur\t : ");
			lama = sc.nextInt();
			if (lama == 1){
				System.out.println("--------------------------------------");
				System.out.print("1. OPPO\n2. Xiaomi\n3. Vivo\n");
				System.out.println("--------------------------------------");
				System.out.print("HP apa yang akan anda Kredit\t\t : ");
				jenishp = sc.nextInt(); 
				System.out.println("--------------------------------------");
				if (jenishp == 1){
					lama = oppo / 6;
					bunga = lama * 4/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + oppo);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
					}
				else if (jenishp == 2) {
					lama = xiaomi / 6;
					bunga = lama * 4/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + xiaomi);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();					
				}
				else if (jenishp == 3) {
					lama = vivo / 6;
					bunga = lama * 4/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + vivo);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
				}
				}
				if (lama == 2){
					System.out.println("--------------------------------------");
					System.out.print("1. OPPO\n2. Xiaomi\n3. Vivo\n");
					System.out.println("--------------------------------------");
					System.out.print("HP apa yang akan anda Kredit\t\t : ");
					jenishp = sc.nextInt(); 
					System.out.println("--------------------------------------");
				if (jenishp == 1){
					lama = oppo / 12;
					bunga = lama * 4/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + oppo);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
					}
				else if (jenishp == 2) {
					lama = xiaomi / 12;
					bunga = lama * 4/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + xiaomi);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
				}
				else if (jenishp == 3) {
					lama = vivo / 12;
					bunga = lama * 4/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + vivo);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
				}
			}
		}
		//LAPTOP
		else if (pilih == 2) {
			laptopjes(1);
			System.out.print("1. 6 Bulan\n2. 12 Bulan\n");
			System.out.println("--------------------------------------");	
			System.out.print("Pilih berapa lama anda mengangsur\t : ");
			lama = sc.nextInt();
			if (lama == 1){
				System.out.println("--------------------------------------");
				System.out.print("1. Acer\n2. Asus\n");
				System.out.println("--------------------------------------");
				System.out.print("Laptop apa yang akan anda Kredit\t : ");
				jenislaptop = sc.nextInt(); 
				System.out.println("--------------------------------------");
				if (jenislaptop == 1){
					lama = acer / 6;
					bunga = lama * 6/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + acer);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
					}
				else if (jenislaptop == 2) {
					lama = asus / 6;
					bunga = lama * 6/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + asus);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
				}
				}
			if (lama == 2){
				System.out.println("--------------------------------------");
				System.out.print("1. Acer\n2. Asus\n");
				System.out.println("--------------------------------------");
				System.out.print("HP apa yang akan anda Kredit\t\t : ");
				jenislaptop = sc.nextInt(); 
				System.out.println("--------------------------------------");
				if (jenislaptop == 1){
					lama = acer / 12;
					bunga = lama * 6/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + acer);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
					}
				else if (jenislaptop == 2) {
					lama = asus / 12;
					bunga = lama * 6/100;
					System.out.println("Bunga\t\t\t : Rp. " + bunga );
					cicilan = lama + bunga;
					System.out.println("--------------------------------------");
					System.out.println();
					System.out.println("==================NOTA================");
					System.out.println("Nomer Kredit\t\t : " + nokre);
					System.out.println("Atas Nama\t\t : " + n);
					System.out.println("Nomer HP\t\t : " + num);
					System.out.println("Harga HP OPPO\t\t : Rp. " + acer);
					System.out.println("Cicilan per bulan\t : Rp. " + cicilan );
					System.out.println("--------------------------------------");
					System.out.println("Tunjukkan Nomer Kredit Untuk mengangsur");
					System.out.println("-------------TERIMA KASIH-------------");
					System.out.println();
				}
				}
				
			}
				System.out.print("Apakah Anda Ingin Kredit Lagi Y/T?");
				char ya = sc.next().charAt(0);
				// ya = sc.next().charAt(0);

				if (ya=='Y' || ya == 'y') {
					maneh = 1;
				}
				else if (ya=='T' || ya == 't'){
					maneh = 0;
				}
		}

	}

	static void hpjes(int list){
		String [][] menu = {{"OPPO", "RP. 1200000"}, {"XIAOMI", "RP. 2200000"}, {"VIVO", "RP.1350000"}};
		System.out.println("================DAFTAR HARGA================");
		for (int i = 0 ; i < menu.length; i++) {
			System.out.println("MERK HP\t\t : " + menu [i][0]);
			System.out.println("HARGA HP\t : " + menu [i][1]);
			System.out.println("============================================");
		}
					
	}

	static void laptopjes(int list){
		String [][] menu = {{"ACER", "RP. 5400000"}, {"ASUS", "RP. 5000000"}};
		System.out.println("================DAFTAR HARGA================");
		for (int i = 0 ; i < menu.length; i++) {
			System.out.println("MERK LAPTOP\t\t : " + menu [i][0]);
			System.out.println("HARGA LAPTOP\t : " + menu [i][1]);
			System.out.println("============================================");
		}
					
	}
}