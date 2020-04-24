import java.util.Scanner;
class yoi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int angka, output, total;

		System.out.println("Inputkan Angka: ");
		angka = sc.nextInt();

		output = angka % 2;
		if (output == 0){
			System.out.println("hasil inputan: " + angka + "hasinya" + output);
		}	
		else if (output == 1 && angka > 1){
			output = angka + 2;
			System.out.print("maka deret ke" + angka + "adalah" + output);
		}
		else{
			output= angka + 1;
			System.out.println("maka deret ke" + angka + "adalah" + output);

		}
		

	}
}

		


	
