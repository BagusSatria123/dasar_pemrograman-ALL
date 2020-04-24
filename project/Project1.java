import java.util.Scanner;
class Project1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Scanner sclul = new Scanner(System.in);
		int nim, kelas, hp, nomor,kode, p;
		String hehe, jurusan, alamat,pj, am,mapel;
		String j, d, jm,absen;
		String nama, pap,lulus;
		int nilai_ijazah, nilai_rapot, prestasi, nilai_akhir, mat,bing;
		int beng2, ale2, c, g, m, total_pembelian1, total_pembelian2;
		int hbbeng2, hbale2, hbc, hbg, hbm;
		int total_harga_beng2, total_harga_ale2, total_harga_Choco;
		int total_harga_gery,total_harga_milo;
		int berapa, diskon_anak_pertama, diskon_anak_kedua, diskon_anak_ketiga, jumlah;

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
				System.out.println("masukkan anda anak ke- berapa: ");
				berapa = sc.nextInt();

				System.out.println("Di kantin tersedia berbagai macam camilan");
				System.out.println("beng-beng,ale-ale,chocolatos,gery,milo");
				System.out.println(" LIST OBAT");
				System.out.print("1. beng-beng 	Rp.6500"); 		
				System.out.print("2. ale-ale 	Rp.7000"); 
				System.out.print("3. chocolatos Rp.5000"); 		
				System.out.print("4. gery 		Rp.3000"); 		
				System.out.print("5. milo 		Rp.2000");	

				System.out.println("Jumlah barang beng-beng: ");
				beng2 = sc.nextInt();
				System.out.print("Jumlah barang Ale-ale: ");
				ale2 = sc.nextInt();
				System.out.print("Jumlah barang Chocolatos: ");
				c = sc.nextInt();
				System.out.print("Jumlah barang Gery: ");
				g = sc.nextInt(); 
				System.out.print("Jumlah barang Milo: ");
				m = sc.nextInt();
				
				System.out.println("harga beng-beng: ");
				hbbeng2 = sc.nextInt();
				System.out.println("harga ale-ale: ");
				hbale2 = sc.nextInt();
				System.out.println("harga Chocolatos: ");
				hbc = sc.nextInt();
				System.out.println("harga gery: ");
				hbg = sc.nextInt();
				System.out.println("harga Milo: ");
				hbm = sc.nextInt();

				total_harga_beng2 = beng2 * hbbeng2;
				total_harga_ale2 = ale2 * hbale2;
				total_harga_Choco = c * hbc;
				total_harga_gery = g * hbg;
				total_harga_milo = m * hbm;
				jumlah = total_harga_beng2 + total_harga_ale2 + total_harga_Choco + total_harga_gery + total_harga_milo;
				if (berapa == 1){
					diskon_anak_pertama = jumlah - (jumlah * 10 / 100) ;				
					System.out.println("Anda anak pertama mendapat diskon: " + diskon_anak_pertama);
				}
				if (berapa == 2){
					diskon_anak_kedua = jumlah - (jumlah * 20 / 100) ;
					System.out.println("Anda anak kedua mendapat diskon: " + diskon_anak_kedua);
				}
				if (berapa == 3){
					diskon_anak_ketiga = jumlah - (jumlah * 30 / 100) ;
					System.out.println("Anda anak ketiga mendapat diskon: " + diskon_anak_ketiga);
				}	
				else{
					System.out.println("Inputan Anda Salah");
				}		
				if (beng2 > 10){
					if (beng2 <= 20){									
				total_pembelian1 = (total_harga_beng2 * 20 / 100)  + total_harga_ale2 + total_harga_Choco + total_harga_gery + total_harga_milo;
				System.out.println ("total pembelian beng2 diskon 20%: " + total_pembelian1);
			}
			else{
				total_pembelian2 =  total_harga_beng2 + total_harga_ale2 + total_harga_Choco + total_harga_gery + total_harga_milo;
				System.out.println("Total Pembelian Tanpa Diskon: " + total_pembelian2);

			}









				







							

				
 



				
				
				



				




				}
			}

			}


		
		}
		}
	}
}


	

