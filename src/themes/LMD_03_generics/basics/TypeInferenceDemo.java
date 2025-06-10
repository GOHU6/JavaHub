package themes.LMD_03_generics.basics;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-generique.htm#generique
 * Section: 5
 * 
 * The compiler can infer type arguments in many cases using the diamond operator <>
 */
public class TypeInferenceDemo {

	static class Container<T>{
		
		T value;
		
		Container(T value){
			this.value = value;
		}
		
		public T get() {
			return value;
		}
	}
	
	public static void main(String[] args) {
		
		Container<String> stringContainer = new Container<>("Inferred String"); // Compiler infers type as String
        System.out.println("Container holds: " + stringContainer.get());

        Container<Double> doubleContainer = new Container<>(42.0); // Type inference using diamond operator <>
        System.out.println("Container holds: " + doubleContainer.get());
        
        System.out.println("\n✅ Type inference demo complete\n\n");

	}
}