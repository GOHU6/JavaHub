package main;

import themes.basics.controlflow.IfElseDemo;
import themes.basics.controlflow.LoopsDemo;
import themes.basics.controlflow.SwitchDemo;
import themes.basics.datatypes.PrimitiveTypesDemo;
import themes.basics.datatypes.ReferenceTypesDemo;
import themes.basics.operators.OperatorsDemo;
import themes.basics.syntax.SyntaxTips;
import themes.basics.utils.ArraysDemo;
import themes.basics.utils.MathDemo;
import themes.basics.utils.ObjectBasicsDemo;
import themes.basics.utils.StringDemo;
import themes.basics.variables.ConstantsDemo;
import themes.basics.variables.TypeCastingDemo;
import themes.basics.variables.VariableScopeDemo;
import themes.basics.variables.VariablesDemo;

public class MainApplication {

	public static void main(String[] args) {
		
		System.out.println("----- 1~ src/themes/basics/variables -----\n");
		VariablesDemo.main(args);
		VariableScopeDemo.main(args);
		TypeCastingDemo.main(args);
		ConstantsDemo.main(args);
		
		System.out.println("\n----- 2~ src/themes/basics/syntax -----\n");
		SyntaxTips.main(args);
		
		System.out.println("\n----- 3~ src/themes/basics/datatypes -----\n");
		PrimitiveTypesDemo.main(args);
		ReferenceTypesDemo.main(args);
		
		System.out.println("\n----- 4~ src/themes/basics/operators -----\n");
		OperatorsDemo.main(args);
		
		System.out.println("\n----- 5~ src/themes/basics/utils -----\n");
		StringDemo.main(args);
		MathDemo.main(args);
		ArraysDemo.main(args);
		ObjectBasicsDemo.main(args);
		
		System.out.println("\n----- 6~ src/themes/basics/controlflow -----\n");
		IfElseDemo.main(args);
		SwitchDemo.main(args);
		LoopsDemo.main(args);
        
        /*
		
        System.out.println("\n--- JMD L4 Functions Methods Class ---");
		StaticVsInstance.static_function();
		// Erreur : StaticVsInstance.instance_function();
		// Besoin de l'objet suivant
		StaticVsInstance staticVsInstance = new StaticVsInstance();
		staticVsInstance.instance_function();
		
		MethodBasics methodBasics = new MethodBasics();
		methodBasics.public_function();
		// methodBasics.private_function(); erreur car private
		// methodBasics.protected_function(); erreur car pas le meme package
		// methodBasics.package_private_function(); erreur car pas le meme package
		
		methodBasics.public_function_arg("Hello Mr ", 5);
		int result = methodBasics.public_function_int();
		System.out.println(result);
		
		// AbstractExample example = new AbstractExample(); erreur car class abstraite
        AbstractChild child = new AbstractChild();
        child.no_abstract_function();   // Hérité de la classe abstraite
        child.abstract_function();   	// Implémenté dans la classe enfant
        
        InterfaceImplementation impl = new InterfaceImplementation();
        impl.test();        			
        impl.default_function();       	// Methode par defaut de l'interface
        
        EnumDaysOfWeek today = EnumDaysOfWeek.MONDAY;
        System.out.println("Day : " + today); 
        System.out.println(today.isWeekend());
        System.out.println("\n-----------------------------");
		
        System.out.println("\n--- JMD L5 Generics ---");
        SimpleGeneric<String> simplestringgeneric = new SimpleGeneric<>();
        simplestringgeneric.setSimpleGeneric("Hello");
        System.out.println(simplestringgeneric);

        SimpleGeneric<Integer> simpleintgeneric = new SimpleGeneric<>();
        simpleintgeneric.setSimpleGeneric(123);
        System.out.println(simpleintgeneric);

        DoubleGeneric<String, Double> doublegeneric = new DoubleGeneric<>("Double", 50.0);
        System.out.println(doublegeneric);

        WildcardGeneric.simplegeneric("Hello Wildcard!");
        WildcardGeneric.simplegeneric(3.14);

        List<String> strings = Arrays.asList("Java", "Generics");
        WildcardGeneric.showlist(strings);

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
        WildcardGeneric.shownumber(integers);

        List<Number> numbers = new ArrayList<>();
        WildcardGeneric.addinteger(numbers);
        WildcardGeneric.showlist(numbers);
        System.out.println("\n-----------------------------");*/
		

	}
}
