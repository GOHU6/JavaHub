package JMD_L5_Generic;

//Classe générique avec un type T (peut etre n'importe quel type String , Integer ...)
public class SimpleGeneric<T> {
	
	private T simplegeneric;

    public void setSimpleGeneric(T simplegeneric) {
        this.simplegeneric = simplegeneric;
    }

    public T getSimpleGeneric() {
        return simplegeneric;
    }

    @Override
    public String toString() {
        return "Simple Generic : " + simplegeneric;
    }
}
