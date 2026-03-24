package com.abc;

public class Test {
	
	// Object Creation 

	public static void main(String[] args) {
		
		int x = 10 ;  // already has a memory 4 byte
		
		
		boolean b = false ;
		
	// custom data type ko new keyword se memory de sakte ho	
		
//           data type    var   ao   memory(heap)     constructor()
	VariablesAndMethods   vm    =     new          VariablesAndMethods();
	System.out.println(vm.age);
	System.out.println(vm.name);
	System.out.println(vm.active);
    System.out.println("*************************************");	
	vm.display();
	System.out.println("*************************************");	
	vm.sum();
	System.out.println("*************************************");	
    vm.display();
	System.out.println("vm.age : "+vm.age);
	
	System.out.println("*********** VM2 **************************");	

	VariablesAndMethods vm2 = new VariablesAndMethods();
	System.out.println("vm2.age : "+vm2.age);

	vm.addition(20 , 10);      // compile time error
	vm.addition(13, 10);
	vm.addition(14, 10);
	vm.addition(15, 10);
	
	vm2.wish("prachi");
	vm2.wish("akash");
	vm2.wish("priti");
	
	System.out.println("def value = "+vm2.def);

	}
}
