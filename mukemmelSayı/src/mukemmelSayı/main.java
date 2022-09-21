package mukemmelSayı;

public class main {

	public static void main(String[] args) {
		int number = 58 ;
		int total=0;
		
		
		for(int i=1; i<number; i++) {
			if(number % i==0) {
				total=total+i;
				
			}
		}
		if(total==number) {
			System.out.println("Mukemmel Sayıdır.");
		}else {
			System.out.println("Mukemmel Sayı Değildir.");
		}

	}

}
