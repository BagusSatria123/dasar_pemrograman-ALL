package projek.akhir;
import java.util.Scanner;
import java.util.Random;
public class ProjectAkhir1{
    static Scanner scmatriks3 = new Scanner(System.in);
    public static void main(String[] args) {
        //menampilkan menu
            menu();
       
} //tutup void main

static void menu() {
        char menu;
		Scanner pilihmenu  = new Scanner(System.in);

		System.out.println("\t   KALKULATOR MATRIKS");
		System.out.println("============================");
		System.out.println("\t\tMENU");
		System.out.println("============================");
		System.out.println("[1] Penjumlahan Matriks");
		System.out.println("[2] Pengurangan Matriks");
                System.out.println("[3] Transpose Matriks");
                System.out.println("[4] Invers matriks");
                System.out.println("[5] Perkalian Matriks");
                System.out.println("[6] Keluar Aplikasi");
		System.out.println("============================");
		System.out.print("Masukkan Pilihan Anda \t\t: ");
		menu = pilihmenu.next().charAt(0);

		if (menu == '1') {
                    System.out.println("\n");
                    System.out.println("----------------- MENU PENJUMLAHAN -----------------");
                    System.out.println("\n");  
                    System.out.println("Masukkan Ordo Matriks");
                    System.out.println("=======================");
                    System.out.print("Masukkan Jumlah Baris :"); 
                    int baris = scmatriks3.nextInt();
                    System.out.print("Masukkan Jumlah Kolom :");
                    int kolom  = scmatriks3.nextInt();

                    System.out.println("\nInput Element Matriks A  : ");
                    int[][] matA = isiMatriks(baris, kolom);
                    menampilkanHasilRenderMatriks(matA);
                
                    System.out.println("\nInput Element Matriks B  : ");
                    int[][] matB = isiMatriks(baris, kolom);
                    menampilkanHasilRenderMatriks(matB);

                    System.out.println("\nHasil Penjumlahan Matriks");
                    System.out.println("*****************************");
                    int[][] sum = sum(matA, matB);
                    menampilkanHasilMatriks(sum);

                    loaderClose();
			}else {
                    
                if (menu == '2') {
                    System.out.println("\n");
		    System.out.println("----------------- MENU PENGURANGAN -----------------");

                    System.out.println("\n");
            
                    System.out.println("Masukkan Ordo Matriks");
                    System.out.println("=======================");
                    System.out.print("Masukkan Jumlah Baris :"); 
                    int baris = scmatriks3.nextInt();
                    System.out.print("Masukkan Jumlah Kolom :");
                    int kolom  = scmatriks3.nextInt();

                    System.out.println("\nInput Element Matriks A  : ");
                    int[][] matA = isiMatriks(baris, kolom);
                    menampilkanHasilRenderMatriks(matA);
                            
                    System.out.println("\nInput Element Matriks B  : ");
                    int[][] matB = isiMatriks(baris, kolom);
                    menampilkanHasilRenderMatriks(matB);

                    System.out.println("\nHasil Pengurangan Matriks");
                    System.out.println("*****************************");
                    int[][] peng = peng(matA, matB);
                    menampilkanHasilMatriks(peng);

                    loaderClose();               
		}
                
                if (menu == '3') {
                    System.out.println("\n");
                    System.out.println("------------------ MENU TRANSPOSE ------------------");
                    System.out.println("\n");
                    System.out.println("Masukkan Ordo Matriks");
                    System.out.println("=======================");
                    System.out.print("Masukkan Jumlah Baris :"); 
                    int baris = scmatriks3.nextInt();
                    System.out.print("Masukkan Jumlah Kolom :");
                    int kolom  = scmatriks3.nextInt();

                    System.out.println("\nInput Element Matriks : ");
                    int[][] arr3 = isiMatriks(baris, kolom);

                    System.out.println("\nTampilan Matriks Sebelum Ditranspose : ");
                    menampilkanHasilRenderMatriks(arr3);

                    System.out.println("\n Tampilan Matriks Setelah Ditranspose");
                    System.out.println("*****************************");
                    transposeMatriks(arr3);
                            
                    loaderClose();
                    //transpose();
                }
                    if (menu == '4') {
                        System.out.println("\n");
                        System.out.println("------------------- MENU INVERS --------------------");
                    //proses invers
                        System.out.println("\n");
      
                        System.out.println("Masukkan Ordo Matriks");
                        System.out.println("=======================");
                        System.out.print("Masukkan Jumlah Baris :"); 
                        int baris = scmatriks3.nextInt();
                        System.out.print("Masukkan Jumlah Kolom :");
                        int kolom  = scmatriks3.nextInt();

                        System.out.println("\nInput Element Matriks : ");
                        int[][] matriks = isiMatriks(baris, kolom);

                        System.out.println("\nTampilan Matriks Sebelum Dinvers : ");
                        menampilkanHasilRenderMatriks(matriks);

                        invers(matriks);

                        loaderClose();
                    }

                    if (menu == '5'){
                    System.out.println("\n");
                    System.out.println("----------- MENU PERKALIAN ----------");
                    perkalian();

                    } // penutup if 5
                    if (menu == '6'){
                        loaderClose();
                        //keluar();
                    }           
        } //penutup else
    }

    // FUNGSI UMUM UNTUK MENGISI MATRIKS, MENAMPILKAN HASIL INPUT MATRIKS, 
    // DAN MENAMPILKAN HASIL JADI PERHITUNGAN MATRIKS

    //Fungsi  mengisi matriks pengurangan dan pertambahan
    static int[][] isiMatriks(int kolom, int baris) {
	int[][] arr1 = new int[kolom][baris];
	for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
		System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                arr1[i][j] = scmatriks3.nextInt(); 
		}
            System.out.println();
	}
	return arr1;
    }
    
    //fungsi menampilkan hasil mengisi matriks pengurangan dan pertambahan
   static void menampilkanHasilRenderMatriks(int[][] arr1) {
            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[0].length; j++) {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
	}

    //menampilkan hasil jadi perhitungan pertambahan dan pengurangan
    static void menampilkanHasilMatriks(int[][] arr2) {
            for(int i = 0; i < arr2.length; i++) {
                for(int j = 0; j < arr2[0].length; j++) {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
	}
    //PERTAMBAHAN
    //fungsi perhitungan penambahan
    static int[][] sum(int[][] baris, int[][] kolom) {
	int[][] arr2 = new int[baris.length][kolom.length];
            for(int i = 0; i < baris.length; i++) {
		for(int j = 0; j < kolom.length; j++) {
                    arr2[i][j] = baris[i][j] + kolom[i][j];
			}
		}
		return arr2;
	}

    //PENGURANGAN
    //fungsi perhitungan pengurangan
    static int[][] peng(int[][] baris, int[][] kolom) {
	int[][] arr2 = new int[baris.length][baris[0].length];
            for(int i = 0; i < baris.length; i++) {
		for(int j = 0; j < baris[0].length; j++) {
                    arr2[i][j] = baris[i][j] - kolom[i][j];
			}
		}
		return arr2;
	}

    //TRANSPOSE
    //fungsi perhitungan transpose
    static void transposeMatriks(int[][] arr3) {
	for (int i = 0; i < arr3[0].length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[j][i]+" ");
            }
            System.out.println();
        }
}
    
    //INVERS
    //fungsi perhitungan invers
   static void invers(int[][] matriks) {
        float determinan = (matriks[0][0] * matriks[matriks.length-1][matriks[0].length-1]) - (matriks[matriks.length-1][0] * matriks[0][matriks[0].length-1]);
            System.out.println("\nDeterminanya Adalah : "+determinan);

            //processing invers
            int temp = matriks[0][0];
            matriks[0][0] = matriks[matriks.length-1][matriks[0].length-1];
            matriks[matriks.length-1][matriks[0].length-1] = temp;
            matriks[0][matriks[0].length-1] = matriks[0][matriks[0].length-1] * -1;
            matriks[matriks.length-1][0] = matriks[matriks.length-1][0] * -1;

            //matriks adjoin
            System.out.println("\n MATRIKS ADJOIN : ");
            for (int i = 0; i < matriks.length; i++){
                for(int j = 0; j < matriks[0].length; j++){
                    System.out.print(matriks[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("\nHasil Invers Dari Matriks Tersebut Adalah : ");
            System.out.println("***********************************************");
            for(int i = 0; i < matriks.length; i++){
            System.out.print("|");
                for(int j = 0; j < matriks[0].length; j++){
                    //System.out.print(matriks[i][j]+"/"+determinan+" "); //bilangan pecahan
                    System.out.print(matriks[i][j]/determinan+"   ");  //bilangan desimal
                    }
                    System.out.println("|");
                }
        }

    static void perkalian(){
        Scanner input = new Scanner(System.in);
            int kolomA, barisA, kolomB, barisB;
                do {
                    System.out.print("\n *********** PERHATIAN ***********");
                    System.out.print("\n Input Kolom A harus sama dengan input Baris B");
                    System.out.print("\n *********** PERHATIAN ***********");

                    System.out.print("\nMasukkan Baris Matriks A : ");
                    barisA = input.nextInt();
                    System.out.print("Masukkan Kolom Matriks A : ");
                    kolomA = input.nextInt();

                    System.out.print("Masukkan Baris Matriks B : ");
                    barisB = input.nextInt();
                    System.out.print("Masukkan Kolom Matriks B : ");
                    kolomB = input.nextInt();
                    }
                    while(kolomA != barisB);
                        System.out.print("\nInput element Matriks A : \n");
                        int[][] matriksA = new int[barisA][kolomA];
                        for (int i = 0; i < barisA; i++) {
                            for (int j = 0; j < kolomA; j++) {
                                //System.out.printf("\n Masukkan MatriksA baris %d kolom %d : ", (i + 1), (j + 1));
                                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                                matriksA[i][j] = input.nextInt();
                            }
                        }
                        
                        System.out.print("\nHasil Matriks A : \n");
                        System.out.println();
                        for (int i = 0; i < barisA; i++) {
                            for (int j = 0; j < kolomA; j++) {
                                System.out.print(matriksA[i][j] + " ");
                            }
                            System.out.println();
                        }

                        System.out.print("\nInput element Matriks B : \n");
                        int[][] matriksB = new int[barisB][kolomB];
                        for (int i = 0; i < barisB; i++) {
                            for (int j = 0; j < kolomB; j++) {
                                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                                //System.out.print("\n Masukkan MatriksB baris %d kolom %d : ", (i + 1), (j + 1));
                                matriksB[i][j] = input.nextInt();
                            }
                        }
                                
                                System.out.print("\n Hasil Matriks B : \n");
                                System.out.println();
                                for (int i = 0; i < barisB; i++) {
                                    for (int j = 0; j < kolomB; j++) {
                                        System.out.print(matriksB[i][j] + " ");
                                    }
                                    System.out.println();
                                }

                                // proses perkalian
                                System.out.println("\nHasil Perkalian Matriks");
                                System.out.println("*******************************");                            
                                int[][] hasil = new int[barisA][kolomB];
                                for (int i = 0; i < barisA; i++) {
                                    for (int j = 0; j < kolomB; j++) {
                                        int x = 0;
                                        for (int k = 0; k < barisB; k++) {
                                            x += matriksA[i][k] * matriksB[k][j];
                                        }
                                        hasil[i][j] = x;
                                    }
                                }
                                for (int i = 0; i < barisA; i++) {
                                    for (int j = 0; j < kolomB; j++) {
                                        System.out.print(hasil[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                        //menu konfirmasi keluar
                        //keluar();
                        loaderClose();
                     
    }

    static void loaderClose() {
        char keluar;
        Scanner sc = new Scanner(System.in);
                System.out.print("Ingin Keluar aplikasi? (Y/N) : ");
		        keluar = sc.next().charAt(0);

                if(keluar == 'N' || keluar == 'n'){
                    System.out.println();
                    menu();
                    } else {
                        System.out.println("Terima Kasih");
                }
    }
}