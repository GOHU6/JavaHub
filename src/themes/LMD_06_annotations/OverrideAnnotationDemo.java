package themes.LMD_06_annotations;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-annotations.htm#annotations
 * Section: 11
 * 
 * @Override is used to indicate that a method is overridden from a superclass or interface.
 * The compiler will throw an error if the method is not actually overriding anything
 */
public class OverrideAnnotationDemo {
	
	static class Animal{
		public void makeSound() {
			System.out.println("Animal makes a sound");
		}
	}
	
	static class Dog extends Animal {
		
		@Override
		public void makeSound() {
			System.out.println("Dog barks");
		}
		
//		@Override
//		public void makesound() {	// Uncommenting this will cause a compile error if incorrectly spelled
//			System.out.println("Dog barks");
//		}

	}
	
	public static void main(String[] args) {
		Animal pet = new Dog();
		pet.makeSound();
		
		System.out.println("\n✅ Override annotation demo complete\n\n");

	}
}