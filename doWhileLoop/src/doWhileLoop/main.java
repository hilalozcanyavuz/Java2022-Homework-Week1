package doWhileLoop;

public class main {

	public static void main(String[] args) {
		//for
		//i=1 sayaç(başlangıç noktam)
		//çift sayılar
		for (int i = 2; i < 10; i+=2) {
		    System.out.println(i);	
		}
		System.out.println("For Döngüsü Bitti");
		
		
        //while (şart olmazsa döngü çalışmaz. )(i=2 denmezse)
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		
		//do-while do (şart uymazsa bile kod 1 defa çalışır. j yi ayzdırır. 10 dan büyük olduğu için döngü tekrar çalışmaz)
		int j=100;
		do {
			
			System.out.println(j);
			  j+=2;
			  if (j>10) {
					System.out.println("Loglandı");
				} 
		} while (j<10);
		System.out.println("do-while döngüsü bitti");
		  
		  
	}

}