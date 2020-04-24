import java.util.Scanner;
class Project3{
	static Scanner sc  = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	public static void main(String[] args){
		String b;
		do{
			System.out.println("=========================================");
			System.out.println("||\t\t\t\t\t||");
			System.out.println("||\t    KANTIN POLINEMA\t\t||");
			System.out.println("||\t\t\t\t\t||");
			System.out.println("=========================================");

			System.out.println("                                         ");

			System.out.println(" LIST Jenis CAMILAN");
			System.out.println("1. beng-beng 		 	 Rp.65000");
			System.out.println("2. Chocolatos 	 	 	 Rp.70000");
			System.out.println("3. Gery		 	 	 Rp.63000");
			System.out.println("4. Ultra Milk  	 	 	 Rp.10000");
			System.out.println("5. Kripik			 Rp.15000");
			System.out.println("6.  Bolu 		 	 Rp.67000");
			System.out.println("7.  Coklat	 	 	 Rp.54000");
			System.out.println("8.  Kuping gajah   		 Rp.74000");
			System.out.println("9.  Lidah Kucing   	 	 Rp.50000");
			System.out.println("10. Waffle		 	 Rp.10000");

			System.out.println("                                         ");

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
		        System.out.print(" Harga Barang:Rp. ");
		        HargaBarang[i]	 =	sc1.nextInt();

		        HargaTotal[i] = JumlahBarang[i]*HargaBarang[i];
		        TotalHarga = HargaTotal[i]+TotalHarga;
		    }
		    tampil(NamaCamilan, JumlahBarang, HargaBarang, a);
		    diskon(TotalHarga);
			
			System.out.println("Apakah Anda ingin Mengulang?");
			b=sc2.nextLine();
		}while(b.equals("iya"));		
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
			System.out.println("\n Maaf Uang Anda Kurang");
		}
		return TotalHarga;
	}

	static void tampil(String[] NamaCamilan, int[] JumlahBarang, int[] HargaBarang, int a){
				
		System.out.println("\n CAMILAN : \n");
		for(int i = 0; i < a; i++){
			System.out.println(" "+NamaCamilan[i]+"\t= Rp. "+HargaBarang[i]+" x "+JumlahBarang[i]);
		}

		
	}
}