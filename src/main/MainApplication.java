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
import themes.oop.abstraction.AbstractClassDemo;
import themes.oop.abstraction.InterfaceDemo;
import themes.oop.classes.ClassStructureDemo;
import themes.oop.encapsulation.AccessModifiersDemo;
import themes.oop.encapsulation.EncapsulationDemo;
import themes.oop.inheritance.InheritanceDemo;
import themes.oop.inheritance.SuperKeywordDemo;
import themes.oop.polymorphism.OverrideOverloadDemo;
import themes.oop.polymorphism.PolymorphismDemo;

public class MainApplication {

	public static void main(String[] args) {
		
		// === 1. BASICS / VARIABLES ===
		// This section covers the fundamental concepts related to variable usage in Java.
		System.out.println("----- 1 ~ BASICS / VARIABLES -----\n");
		VariablesDemo.main(args);
		VariableScopeDemo.main(args);
		TypeCastingDemo.main(args);
		ConstantsDemo.main(args);
		
		// === 2. BASICS / SYNTAX ===
		// This section includes general tips and tricks related to Java syntax.
		System.out.println("\n----- 2 ~ BASICS / SYNTAX -----\n");
		SyntaxTips.main(args);
		
		// === 3. BASICS / DATATYPES ===
		// Demonstrates the different kinds of data types in Java including primitive types and reference types.
		System.out.println("\n----- 3 ~ BASICS / DATATYPES -----\n");
		PrimitiveTypesDemo.main(args);
		ReferenceTypesDemo.main(args);
		
		// === 4. BASICS / OPERATORS ===
		// Shows how to use arithmetic, relational, logical, and assignment operators in Java.
		System.out.println("\n----- 4 ~ BASICS / OPERATORS -----\n");
		OperatorsDemo.main(args);
		
		// === 5. BASICS / UTILS ===
		// This section includes general-purpose utility demos related to Strings, math, arrays, and objects.
		System.out.println("\n----- 5 ~ BASICS / UTILS -----\n");
		StringDemo.main(args);
		MathDemo.main(args);
		ArraysDemo.main(args);
		ObjectBasicsDemo.main(args);
		
		// === 6. BASICS / CONTROL FLOW ===
		// Shows conditional statements and loop structures in Java.
		System.out.println("\n----- 6 ~ BASICS / CONTROL FLOW -----\n");
		IfElseDemo.main(args);
		SwitchDemo.main(args);
		LoopsDemo.main(args);
		
		System.out.println("\n----- -------------------------- -----\n");

		// === 1. OOP / CLASSES ===
		// Shows how to define a basic class with attributes, constructor, and method.
		System.out.println("----- 1 ~ OOP / CLASSES -----\n");
		ClassStructureDemo.main(args);
		
		// === 2. OOP / ABSTRACTION ===
		// Demonstrates abstraction using both abstract classes and interfaces.
		// Abstract classes define partial implementations.
		// Interfaces define a contract without implementation.
		System.out.println("----- 2 ~ OOP / ABSTRACTION -----\n");
		AbstractClassDemo.main(args);
		InterfaceDemo.main(args);
		
		// === 3. OOP / ENCAPSULATION ===
		// Demonstrates data hiding and access control using private fields and public getters/setters,
		// as well as Java's access modifiers and the 'final' keyword.
		System.out.println("----- 3 ~ OOP / ENCAPSULATION -----\n");
		EncapsulationDemo.main(args);
		AccessModifiersDemo.main(args);
		
		// === 4. OOP / INHERITANCE ===
		// Shows how subclasses inherit from parent classes and use 'super' to call parent methods or constructors.
		System.out.println("----- 4 ~ OOP / INHERITANCE -----\n");
		InheritanceDemo.main(args);
		SuperKeywordDemo.main(args);
		
		// === 5. OOP / POLYMORPHISM ===
		// Demonstrates method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).
		System.out.println("----- 5 ~ OOP / POLYMORPHISM -----\n");
		PolymorphismDemo.main(args);
		OverrideOverloadDemo.main(args);

		System.out.println("\n----- -------------------------- -----\n");

		
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
