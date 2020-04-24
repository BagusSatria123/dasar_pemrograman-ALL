import java.util.Scanner;
class Project2{
		static Scanner sc = new Scanner(System.in);
		static Scanner sc1 = new Scanner(System.in);
		static Scanner sc2 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner sclul = new Scanner(System.in);
		public static void main(String[] args){
		int nim, kelas, hp, nomor,kode, p;
		String hehe, jurusan, alamat,pj, am,mapel;
		String j, d, jm,absen;
		String nama, pap,lulus;
		int nilai_ijazah, nilai_rapot, prestasi, nilai_akhir, mat,bing;

		System.out.println("Apakah Anda lulus Dari SMA?");
		lulus = sc.nextLine();
		if(lulus.equals("iya")){

		}
		System.out.println("Masukkan Nilai Rata-rata Ujian Negara Anda: ");
		nilai_ijazah = sc.nextInt();
		System.out.println("Masukkan Nilai Rata-rata rapot: ");
		nilai_rapot = sc.nextInt();
		System.out.println("Masukkan Nilai Matematika");
		mat = sc.nextInt();
		System.out.println("Masukkan Nilai Bahasa Inggris");
		bing = sc.nextInt();
		System.out.println("Masukkan Jumlah Prestasi Anda Selama SMA: ");
		prestasi = sc.nextInt();
		if (nilai_ijazah > 6){
			System.out.println("Anda Lulus Di Input ujian negara");
		}
		else{
			System.out.println("Anda Tidak Lulus Di Input Ujian Negara");
		}
		if (nilai_rapot > 6){
			System.out.println("Anda Lulus Di Input Rapot");
		}
		else{
			System.out.println("Anda Tidak Lulus Di input Rapot");
		}
		
		nilai_akhir = (nilai_ijazah + nilai_rapot ) / 3 + prestasi;
		if (nilai_akhir > 6){
		if (nilai_akhir > 6 && mat > 8 ){
			System.out.println("Anda Masuk Jurusan Akuntansi");
		}
		else if (nilai_akhir > 6 && bing > 8){
			System.out.println("Anda Masuk Jurusan Informatika");
		}
		else{
			System.out.println("Anda Tidak di terima");
		}

		System.out.println("SELAMAT DATANG DI POLINEMA");
		System.out.println("---------------------------------BIODATA MAHASISWA POLINEMA-----------------------------");
		System.out.println("Apakah Anda Mahasiswa POLINEMA ?");
		hehe = sclul.nextLine();
		if(hehe.equals("iya")){
			System.out.println("Masukkan Kode Mahasiswa Anda: ");
			kode = sc.nextInt();
			if (kode == 456){
			
			System.out.println("Masukkan Nama: ");
			nama = sclul.nextLine();
			 System.out.println("Masukkan Jurusan: ");
			 jurusan = sclul.nextLine();
			 System.out.println("Masukkan Alamat: ");
			 alamat = sclul.nextLine();
			System.out.println("Masukkan NIM: ");
			nim = sclul.nextInt();
			System.out.println("Masukkan Kelas: ");
			kelas = sclul.nextInt();	
			System.out.println("Mendapat Mapel Dasar(PANCASILA,K3,TEKDOK,");
			mapel = sclul.nextLine();		
			System.out.println("-------------------------------Pengambilan Jadwal kelas--------------------------------");
			pj = sclul.nextLine();
			System.out.println("Masukkan Kode Mahasiswa: ");
			kode = sclul.nextInt();
			if (kode == 456){
				System.out.println("Anda Mahasiswa Polinema");
				am = sc.nextLine();
				System.out.println("Pilih Nomor Jadwal Kuliah 1-4: ");
				p = sc.nextInt();

				if (p == 1){
					System.out.println("Anda Mendapat Jadwal Kuliah");
					j = sc.nextLine();
					System.out.println("Hari Senin-Jumat");
					d = sc.nextLine();
					System.out.println("jadwal masuk dan keluar (07.00 - 12.00)");
					jm = sc.nextLine();
				}
				else if (p == 2){
					System.out.println("Anda Mendapat Jadwal Kuliah");
					j = sc.nextLine();
					System.out.println("Hari Senin-Jumat");
					d = sc.nextLine();
					System.out.println("jadwal masuk dan keluar (08.00-13.00)");
					jm = sc.nextLine();
				}
				else if (p == 3){
					System.out.println("Anda Mendapat Jadwal Kuliah");
					j = sc.nextLine();
					System.out.println("Hari Senin-Jumat");
					d = sc.nextLine();
					System.out.println("jadwal masuk dan keluar (09.00-14.00)");
					jm = sc.nextLine();
				}
				else if (p == 4){
					System.out.println("Anda Mendapat Jadwal Kuliah");
					j = sc.nextLine();
					System.out.println("Hari Senin-Jumat");
					d = sc.nextLine();
					System.out.println("jadwal masuk dan keluar (10.00-15.00)");
					jm = sc.nextLine();
				}
				else{
					System.out.println("Inputan salah/pilihan salah");
				}
				
				System.out.println("-----------------------------------SISTEM KANTIN--------------------------------");
				String b;
		do{
			System.out.println("=========================================");
			System.out.println("||\t\t\t\t\t||");
			System.out.println("||\tKANTIN POLINEMA\t\t\t||");
			System.out.println("||\t\t\t\t\t||");
			System.out.println("=========================================");

			System.out.println("                                         ");

			System.out.println(" LIST Jenis CAMILAN");
			System.out.println("1. beng-beng 		 	 Rp.6500");
			System.out.println("2. Chocolatos 	 	 	 Rp.7000");
			System.out.println("3. Gery		 	 	 Rp.6300");
			System.out.println("4. Ultra Milk  	 	 	 Rp.1000");
			System.out.println("5. Kripik			 Rp.1500");
			System.out.println("6.  Bolu 		 	 Rp.6700");
			System.out.println("7.  Coklat	 	 	 Rp.5400");
			System.out.println("8.  Kuping gajah   		 Rp.7400");
			System.out.println("9.  Lidah Kucing   	 	 Rp.5000");
			System.out.println("10. Waffle		 	 Rp.1000");

			System.out.println("                                       ");

			System.out.print("Masukkan Berapa Jenis Camilan Yang Di Beli:");
			int a = sc.nextInt();

			String [] NamaCamilan = new String[a];
			int [] JumlahBarang=new int[a];
			int [] HargaBarang=new int[a];
			double [] HargaTotal=new double [a];
			double TotalHarga = 0;
		
			for(int i=0; i<a; i++){
		        System.out.print("\n Nama Camilan: ");	
		        NamaCamilan[i]	 =	sc.next(); 
		        System.out.print(" Jumlah Barang: "); 
		        JumlahBarang[i] =	sc1.nextInt();
		        System.out.print(" Harga Barang:Rp ");
		        HargaBarang[i]	 =	sc1.nextInt();

		        HargaTotal[i] = JumlahBarang[i]*HargaBarang[i];
		        TotalHarga = HargaTotal[i]+TotalHarga;
		    }
		    tampil(NamaCamilan, JumlahBarang, HargaBarang, a);
		    diskon(TotalHarga);

			System.out.println("Apakah Anda ingin Mengulang?");
			b=sc2.nextLine();
		}while(b.equals("IYA"));			
	}

	static double diskon(double TotalHarga){
		double potongan = 0;
		double TotalBayar = 0;
		if (TotalHarga>=100000){ 
	    	potongan=0.2*TotalHarga;
	    } else if ((TotalHarga>=85000) && (TotalHarga<100000)) {
	    	potongan = 0.1*TotalHarga;
	    } else {
	    	potongan = 0;
	    }
	    TotalBayar=TotalHarga-potongan;

	    System.out.println("\n---------------------------------------\n");
		System.out.println(" Total Harga\t = Rp. "+TotalHarga);
		System.out.println(" Potongan\t = Rp. "+potongan);
		System.out.println(" Total\t\t = Rp. "+TotalBayar);
		System.out.print(" Bayar\t\t = Rp. ");
		double bayar = sc.nextDouble();
		
		if(bayar > TotalBayar) {
			TotalBayar = bayar - TotalBayar;
			System.out.println("\n Kembalian\t = Rp. "+TotalBayar);
		} else {
			System.out.println("\n Maaf Uang Kurang");
		}

		return TotalHarga;

	}

	static void tampil(String[] NamaCamilan, int[] JumlahBarang, int[] HargaBarang, int a){
				
		System.out.println("\n CAMILAN : \n");
		for(int i = 0; i < a; i++){
			System.out.println(" "+NamaCamilan[i]+"\t = Rp. "+HargaBarang[i]+" x "+JumlahBarang[i]);
		}

		
	}
}








				







							

				
 



				
				
				



				




				
			

			
		
	



	

