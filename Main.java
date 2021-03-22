
//superclass,perent class
class Sepatu{
	String merk,jenis,madeIn;
	int harga;
}
//ini yang dinamakan inheritance dengan menambahkan extends
//extends akan mengambil atribute dari class yang di inherit
class SepatuLokal extends Sepatu{
	
}

public class Main {
	public static void main(String[] args) {
		Sepatu adidas= new Sepatu();
		adidas.jenis="Olahraga";
		adidas.harga=120000;
		adidas.merk="Adidas";
		adidas.madeIn="China";
			System.out.println("sepatu 1");
			System.out.println(adidas.jenis);
			System.out.println(adidas.harga);
			System.out.println(adidas.merk);
			System.out.println(adidas.madeIn);
		
			SepatuLokal swallow= new SepatuLokal();
			swallow.jenis="Pantai";
			swallow.harga=410000;
			swallow.merk="swallow";
			swallow.madeIn="Jepang";
				System.out.println("\nsepatu 2");
				System.out.println(swallow.jenis);
				System.out.println(swallow.harga);
				System.out.println(swallow.merk);
				System.out.println(swallow.madeIn);
			
	}
}
