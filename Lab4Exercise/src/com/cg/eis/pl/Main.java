package com.cg.eis.pl;

import com.cg.eis.service.ImplementationClass;

public class Main {

	public static void main(String[] args) {
		
		ImplementationClass person1 = new ImplementationClass("Shubham",22,18000,"Senior Analyst","Standard");
		
		person1.showDetails();
		
		person1.findInsuranceScheme();
	}

}
