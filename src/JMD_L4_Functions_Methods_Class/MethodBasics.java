package JMD_L4_Functions_Methods_Class;

public class MethodBasics {
	
	// Méthode publique accessible partout
    public void public_function() {		
        System.out.println("public method!");
    }
    
    // Méthode privée accessible uniquement dans cette classe
    private void private_function() {	
        System.out.println("private method!");
    }
    
    // Méthode protégée accessible dans les sous-classes ou le même package
    protected void protected_function() {	
        System.out.println("protected method!");
    }
    
    // Sans modificateur package-private accessible uniquement dans le même package
    void package_private_function() {	
        System.out.println("package-private method!");
    }
    
    // Fonction qui prend un String et un int en paramètres
    public void public_function_arg(String x, int y) {
    	System.out.println(x + y); 
    }
    
    // Fonction qui retourne un entier (ou autre data type)
    public int public_function_int() {
    	int z = 10;
		return z;
    }
}
