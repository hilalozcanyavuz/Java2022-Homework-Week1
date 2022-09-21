package stringsDemo2;


public class main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
      /*  System.out.println("Eleman sayısı: "+ mesaj.length());
        
        System.out.println("x: 5.eleman: " +mesaj.charAt(4));
        
        System.out.println(mesaj.concat(" Yaşasın!"));
        
        System.out.println(mesaj.startsWith("A")); // doğru yada yanlış olarak döndürür. Başlangıç harfi
        
        System.out.println(mesaj.endsWith(".")); // bitiş harfini denetler
        
        char [] karakterler= new char[5];
        
        mesaj.getChars(0, 5 , karakterler , 0);
        System.out.println(karakterler);
        
        System.out.println(mesaj.indexOf('a')); // ilk a yı bulur
        System.out.println(mesaj.indexOf("av")); 
        System.out.println(mesaj.lastIndexOf("e")); //aramaya baştan başlar. Sondan ilk e yi gösterir.
        System.out.println(mesaj.lastIndexOf("a"));      */
        
		String yeniMesaj =mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));//mesajın 2. karakterden sonra keser
		System.out.println(mesaj.substring(2, 5));
		
		for(String kelime: mesaj.split(" ")) { // istenilen karakterlerden sonra alt satıra indirerek çıktı verir. Biz boşluk seçtik
		System.out.println(kelime);
	         }
		System.out.println(mesaj.toLowerCase()); // büyük harfleri küçültür.
		System.out.println(mesaj.toUpperCase()); // küçük harfleri büyük yazar.
		System.out.println(mesaj.trim()); // metinin baştaki ve sondaki boşlukları siler.
		
	}
}

