package themes.LMD_06_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-annotations.htm#annotations
 * Section: 11
 * 
 * Demonstrates how to define and use a custom annotation.
 */
public class CustomAnnotationDemo {
	
	@Retention(RetentionPolicy.RUNTIME) // lifetime of annotation
	public @interface Info{ // @interface is like class but to create an annotation
		String auth = "Hugo";
		String date();
	}
	
	@Info(date = "2025")
	public static void annotatedMethod() {
		System.out.println("Executing annotated method ...");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] arg) throws Exception {
		Method method = CustomAnnotationDemo.class.getMethod("annotatedMethod"); // 'Method' read the annotation via reflection
		if(method.isAnnotationPresent(Info.class)) { // Check whether the method is annotated with @Info
			Info info = method.getAnnotation(Info.class);
			System.out.println("Author :" + info.auth + " , Date :" + info.date());
		}
		
		annotatedMethod();
		
		System.out.println("\n✅ Custom annotation demo complete\n\n");

	}
}