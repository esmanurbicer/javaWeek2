package reCapDemo_classes;

public class Main {

	public static void main(String[] args) {
   
	DortIslem dortIslem = new DortIslem();
    
    
    int bolumSonucu= dortIslem.Bol(15, 5);
    int carpımSonucu= dortIslem.Carp(2, 6);
    int cikarmaSonucu= dortIslem.Cikar(72, 39);
    int toplamSonucu= dortIslem.Topla(579, 54);
    
    
    System.out.println("Toplam sonucu:" + toplamSonucu);
    System.out.println("Bölüm Sonucu:" + bolumSonucu);
    System.out.println("Çıkarma Sonucu" + cikarmaSonucu);
    System.out.println("Çarpım Sonucu" + carpımSonucu);
    
	}

}
