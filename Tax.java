package com.basic.pkg;

public class Tax {

public static void main(String[] args) {
	int salary=1000000;
	Tax t1=new Tax();
    double ta1 =t1.find_old(salary);
	Tax t2=new Tax();
	double ta2=t2.find_previous(salary);
	Tax t3=new Tax();
	double ta3=t3.find_revised(salary);
	 //if(ta1==0 && ta2==0 && ta3 ==0) {
		// System.out.println("Tax amount: zero");
	//}
	 double small= ta1<ta2 && ta1<ta3?ta1: ta2<ta3?ta2:ta3;
	 System.out.println("Tax amount:"+ small);
	 }

private double find_revised(int salary) {
	double amount=0;
	if(salary<=300000) {
	amount=0;
	}
	if(salary>300000 && salary<=600000) {
	amount=0+((salary-300000)*5.0/100.0);
	}
	if(salary>600000 && salary<=900000) {
		amount=0+(300000*5.0/100.0)+((salary-600000)*10.0/100.0);
	}
	if(salary>900000 && salary<=1200000) {
		amount=0+(300000*5.0/100.0)+(300000*10.0/100.0)+((salary-900000)*15.0/100.0);
	}
	if(salary>1200000 && salary<=1500000) {
		amount=0+(300000*5.0/100.0)+(300000*10.0/100.0)+(300000*15.0/100.0)+((salary-1200000)*20.0/100.0);
	}
	if (salary>1500000) {
		amount=0+(300000*5.0/100.0)+(300000*10.0/100.0)+(300000*15.0/100.0)+(300000*20.0/100.0)+((salary-1500000)*30.0/100.0);
	}
	return amount;
}

private double find_previous(int salary) {
	double amount= 0;
	if(salary<=250000) {
		amount= 0;
	}
	if(salary>250000 && salary<=500000) {
		amount=0+((salary-250000)*5.0/100.0);
}
	if(salary>500000 && salary<=750000) {
		amount=0+(250000*5.0/100.0)+((salary-500000)*10.0/100.0);
	}
	
   if(salary>750000 && salary<=1000000) {
	amount=0+(250000*5.0/100.0)+(250000*10.0/100.0)+((salary-750000)*15.0/100.0);
	}
	if(salary>1000000 && salary<=1250000) {
	amount=0+(250000*5.0/100.0)+(250000*10.0/100.0)+(250000*15.0/100.0)+((salary-1000000)*20.0/100.0);
	}
   if(salary>1250000 && salary<= 1500000) {
	amount=0+(250000*5.0/100.0)+(250000*10.0/100.0)+(250000*15.0/100.0)+(250000*20.0/100.0)+((salary-1250000)*25.0/100.0);
	}
	 if(salary>1500000) {
	amount=0+(250000*5.0/100.0)+(250000*10.0/100.0)+(250000*15.0/100.0)+(250000*20.0/100.0)+(250000*25.0/100.0)+((salary-1500000)*30.0/100.0);
	}
	 return amount;
}

private double find_old(int salary) {
	double amount=0;
	if(salary<=250000) {
		amount=0;
	}
	if(salary>250000 && salary<=500000){
		amount=0+((salary-250000)*5.0/100.0);
	}
	if(salary>500000 && (salary<=1000000)) {
		amount=0+(250000*5.0/100.0)+((salary-500000)*20.0/100.0);
	}
	if(salary > 1000000) {
		amount=0+(250000*5.0/100.0)+(500000*20.0/100.0)+((salary-1000000)*30.0/100.0);
	}
	return amount;
}
}
