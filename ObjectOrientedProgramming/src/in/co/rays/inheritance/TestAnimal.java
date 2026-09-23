package in.co.rays.inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Elephant e = new Elephant();
		
//	Test Dog	
		d.setSpeed(500);
		d.setVoice("laffy");
		d.setTail("long");
		
		System.out.println(d.getTail());
		System.out.println(d.getVoice());
		System.out.println(d.getSpeed());
		
//	Test Elephant
		
		e.setTeeth("Long");
		e.setTrunk("Long");
		e.setVoice("normal");
		
		System.out.println(e.getTeeth());
		System.out.println(e.getTrunk());
		System.out.println(e.getVoice());
		
		
		
		
	}

}
