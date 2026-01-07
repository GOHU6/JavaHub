package main;

import themes.LMD_01_basics.controlflow.IfElseDemo;
import themes.LMD_01_basics.controlflow.LoopsDemo;
import themes.LMD_01_basics.controlflow.SwitchDemo;
import themes.LMD_01_basics.datatypes.PrimitiveTypesDemo;
import themes.LMD_01_basics.datatypes.ReferenceTypesDemo;
import themes.LMD_01_basics.operators.OperatorsDemo;
import themes.LMD_01_basics.syntax.SyntaxTips;
import themes.LMD_01_basics.utils.ArraysDemo;
import themes.LMD_01_basics.utils.MathDemo;
import themes.LMD_01_basics.utils.ObjectBasicsDemo;
import themes.LMD_01_basics.utils.StringDemo;
import themes.LMD_01_basics.variables.ConstantsDemo;
import themes.LMD_01_basics.variables.TypeCastingDemo;
import themes.LMD_01_basics.variables.VariableScopeDemo;
import themes.LMD_01_basics.variables.VariablesDemo;
import themes.LMD_02_oop.abstraction.AbstractClassDemo;
import themes.LMD_02_oop.abstraction.InterfaceDemo;
import themes.LMD_02_oop.classes.ClassStructureDemo;
import themes.LMD_02_oop.encapsulation.AccessModifiersDemo;
import themes.LMD_02_oop.encapsulation.EncapsulationDemo;
import themes.LMD_02_oop.inheritance.InheritanceDemo;
import themes.LMD_02_oop.inheritance.SuperKeywordDemo;
import themes.LMD_02_oop.polymorphism.OverrideOverloadDemo;
import themes.LMD_02_oop.polymorphism.PolymorphismDemo;
import themes.LMD_03_generics.basics.GenericClassDemo;
import themes.LMD_03_generics.basics.GenericMethodDemo;
import themes.LMD_03_generics.basics.TypeInferenceDemo;
import themes.LMD_03_generics.wildcards.BoundedWildcardDemo;
import themes.LMD_03_generics.wildcards.UnboundedWildcardDemo;
import themes.LMD_04_exceptions.CustomExceptions;
import themes.LMD_04_exceptions.FinallyBlockDemo;
import themes.LMD_04_exceptions.ThrowsKeywordDemo;
import themes.LMD_04_exceptions.TryCatchDemo;
import themes.LMD_05_enums.EnumBasicsDemo;
import themes.LMD_05_enums.EnumIterationDemo;
import themes.LMD_05_enums.EnumWithFieldsDemo;
import themes.LMD_06_annotations.CustomAnnotationDemo;
import themes.LMD_06_annotations.OverrideAnnotationDemo;
import themes.LMD_06_annotations.RetentionPolicyDemo;
import themes.LMD_06_annotations.SuppressWarningsDemo;
import themes.LMD_07_collections.maps.HashMapDemo;
import themes.LMD_07_collections.maps.TreeMapDemo;
import themes.LMD_07_collections.queues.PriorityQueueDemo;
import themes.LMD_07_collections.queues.QueueDemo;
import themes.LMD_07_collections.sets.HashSetDemo;
import themes.LMD_07_collections.sets.TreeSetDemo;
import themes.LMD_08_io.BufferedReaderDemo;
import themes.LMD_08_io.BufferedWriterDemo;
import themes.LMD_08_io.FileDemo;
import themes.LMD_09_streams.LambdaSyntaxDemo;
import themes.LMD_09_streams.OptionalDemo;
import themes.LMD_09_streams.StreamCreationDemo;
import themes.LMD_09_streams.StreamIntermediateOps;
import themes.LMD_09_streams.StreamTerminalOps;

public class MainApplication {

	public static void main(String[] args) throws Exception {
		
		// === BASICS / VARIABLES ===
		// This section covers the fundamental concepts related to variable usage in Java.
		System.out.println("----- 1.1 ~ BASICS / VARIABLES -----\n");
		VariablesDemo.main(args);
		VariableScopeDemo.main(args);
		TypeCastingDemo.main(args);
		ConstantsDemo.main(args);
		
		// === BASICS / SYNTAX ===
		// This section includes general tips and tricks related to Java syntax.
		System.out.println("\n----- 1.2 ~ BASICS / SYNTAX -----\n");
		SyntaxTips.main(args);
		
		// === BASICS / DATATYPES ===
		// Demonstrates the different kinds of data types in Java including primitive types and reference types.
		System.out.println("\n----- 1.3 ~ BASICS / DATATYPES -----\n");
		PrimitiveTypesDemo.main(args);
		ReferenceTypesDemo.main(args);
		
		// === BASICS / OPERATORS ===
		// Shows how to use arithmetic, relational, logical, and assignment operators in Java.
		System.out.println("\n----- 1.4 ~ BASICS / OPERATORS -----\n");
		OperatorsDemo.main(args);
		
		// === BASICS / UTILS ===
		// This section includes general-purpose utility demos related to Strings, math, arrays, and objects.
		System.out.println("\n----- 1.5 ~ BASICS / UTILS -----\n");
		StringDemo.main(args);
		MathDemo.main(args);
		ArraysDemo.main(args);
		ObjectBasicsDemo.main(args);
		
		// === BASICS / CONTROL FLOW ===
		// Shows conditional statements and loop structures in Java.
		System.out.println("\n----- 1.6 ~ BASICS / CONTROL FLOW -----\n");
		IfElseDemo.main(args);
		SwitchDemo.main(args);
		LoopsDemo.main(args);
		
		System.out.println("\n----- -------------------------- -----\n");

		// === OOP / CLASSES ===
		// Shows how to define a basic class with attributes, constructor, and method.
		System.out.println("----- 2.1 ~ OOP / CLASSES -----\n");
		ClassStructureDemo.main(args);
		
		// === OOP / ABSTRACTION ===
		// Demonstrates abstraction using both abstract classes and interfaces.
		// Abstract classes define partial implementations.
		// Interfaces define a contract without implementation.
		System.out.println("----- 2.2 ~ OOP / ABSTRACTION -----\n");
		AbstractClassDemo.main(args);
		InterfaceDemo.main(args);
		
		// === OOP / ENCAPSULATION ===
		// Demonstrates data hiding and access control using private fields and public getters/setters,
		// as well as Java's access modifiers and the 'final' keyword.
		System.out.println("----- 2.3 ~ OOP / ENCAPSULATION -----\n");
		EncapsulationDemo.main(args);
		AccessModifiersDemo.main(args);
		
		// === OOP / INHERITANCE ===
		// Shows how subclasses inherit from parent classes and use 'super' to call parent methods or constructors.
		System.out.println("----- 2.4 ~ OOP / INHERITANCE -----\n");
		InheritanceDemo.main(args);
		SuperKeywordDemo.main(args);
		
		// === OOP / POLYMORPHISM ===
		// Demonstrates method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).
		System.out.println("----- 2.5 ~ OOP / POLYMORPHISM -----\n");
		PolymorphismDemo.main(args);
		OverrideOverloadDemo.main(args);

		System.out.println("\n----- -------------------------- -----\n");

		// === GENERICS / BASICS ===
		// Defining generic classes and methods using type parameters <T>
		System.out.println("----- 3.1 ~ GENERICS / BASICS -----\n");
		GenericClassDemo.main(args);
		GenericMethodDemo.main(args);
		TypeInferenceDemo.main(args);
		
		// === GENERICS / WILDCARDS ===
		// Wildcards generics <?>, ? extends T and ? super T
		System.out.println("----- 3.2 ~ GENERICS / WILDCARDS -----\n");
		BoundedWildcardDemo.main(args);
		UnboundedWildcardDemo.main(args);
		
		System.out.println("\n----- -------------------------- -----\n");
		
		// === EXCEPTIONS ===
		// Demonstrates how catch all type of exceptions
		System.out.println("----- 4.1 ~ EXCEPTIONS -----\n");
		TryCatchDemo.main(args);
		FinallyBlockDemo.main(args);
		ThrowsKeywordDemo.main(args);
		CustomExceptions.main(args);
		
		System.out.println("\n----- -------------------------- -----\n");
		
		// === ENUMS ===
		// Demonstrates core features of Java enums
		System.out.println("----- 5.1 ~ ENUMS -----\n");
		EnumBasicsDemo.main(args);
		EnumWithFieldsDemo.main(args);
		EnumIterationDemo.main(args);
		
		System.out.println("\n----- -------------------------- -----\n");
		
		// === ANNOTATIONS ===
		System.out.println("----- 6.1 ~ ANNOTATIONS -----\n");
		OverrideAnnotationDemo.main(args);
		SuppressWarningsDemo.main(args);
		CustomAnnotationDemo.main(args);
		RetentionPolicyDemo.main(args);

		System.out.println("\n----- -------------------------- -----\n");
		
		// === COLLECTIONS ===
		System.out.println("----- 7.1 ~ COLLECTIONS -----\n");
		HashMapDemo.main(args);
		TreeMapDemo.main(args);
		PriorityQueueDemo.main(args);
		QueueDemo.main(args);
		HashSetDemo.main(args);
		TreeSetDemo.main(args);

		System.out.println("\n----- -------------------------- -----\n");
		
		// === I.O ===
		System.out.println("----- 8.1 ~ I.O -----\n");
		BufferedReaderDemo.main(args);
		BufferedWriterDemo.main(args);
		FileDemo.main(args);

		System.out.println("\n----- -------------------------- -----\n");
		
		// === STREAMS ===
		System.out.println("----- 9.1 ~ STREAMS -----\n");
		LambdaSyntaxDemo.main(args);
		OptionalDemo.main(args);
		StreamCreationDemo.main(args);
		StreamIntermediateOps.main(args);
		StreamTerminalOps.main(args);
		
	}
}
