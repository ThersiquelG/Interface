package myPackage;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implinterface1 notes = new implinterface1();
		
		notes.setV1(14);
		notes.setV2(12);
		
		
		System.out.println("la note minimale entre : " + notes.getV1() + " et : " + notes.getV2() + " est égale à : " + notes.minimum());
		
		
		
		implinterface2 taille = new implinterface2();
		
		taille.setV1(165);
		taille.setV2(189);
		taille.setV3(171);
		
		System.out.println("la taille maximale est de : " + taille.maximum() + " cm .");
	}

}
