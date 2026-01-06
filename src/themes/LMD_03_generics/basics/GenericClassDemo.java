package themes.LMD_03_generics.basics;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-generique.htm#generique
 * Section: 5
 * 
 * Single type parameter <T> allows the class to store and return objects of any type
 */
public class GenericClassDemo {
	
	static class Box<T> { // Generic class type parameter T
		private T value;
		
		public void set(T value) {
			this.value = value;
		}
		
		public T get() {
			return value;
		}
	}
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>(); // Can be a String
		stringBox.set("Generics");
		System.out.println("String box contains: " + stringBox.get());

		Box<Integer> intBox = new Box<>(); // Can be an Integer
		intBox.set(123);
		System.out.println("Integer box contains: " + intBox.get());
		
		System.out.println("\n Generic class demo complete\n\n");
	}
}