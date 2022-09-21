package sayıBulma;

public class main {

	public static void main(String[] args) {
		int[] sayilar= new int [] {1,2,5,7,9,0} ;
		int aranacak=28;
		
		boolean varMı = false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak ) {
				varMı=true;
				break;
				
			}
		}
		if(varMı) {
			System.out.println("Sayı Mevcuttur.");
		}else {
			System.out.println("Sayı Mevcut Değildir. ");
		}
		

	}

}
