package themes.LMD_06_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Reference : https://www.jmdoudoux.fr/java/dej/chap-annotations.htm#annotations
 * Section: 11
 * 
 * Demonstrates different retention policies for annotations.
 */
public class RetentionPolicyDemo {
	
	@Retention(RetentionPolicy.SOURCE) // Annotation retained only in source code (not compiled)
    public @interface SourceLevel {}
	
    @Retention(RetentionPolicy.CLASS) // Annotation kept in .class file, but not available at runtime
    public @interface ClassLevel {}
    
    @Retention(RetentionPolicy.RUNTIME) // Annotation retained and accessible at runtime (via reflection)
    public @interface RuntimeLevel {}
    
    @RuntimeLevel  // Apply an annotation with RUNTIME retention to this method
    public static void runtime() {}
    
    public static void main(String[] args) {
    	
    	System.out.println("Only annotations with RUNTIME retention are visible at runtime.");
    	System.out.println("Annotations with SOURCE or CLASS retention are not accessible via reflection.");
    	
		System.out.println("\n✅ Retention policy demo complete\n\n");

    }
}