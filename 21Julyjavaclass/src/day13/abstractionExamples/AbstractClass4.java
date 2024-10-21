package day13.abstractionExamples;
abstract class RBIBank102 {
	public abstract double getRateOfInterestForHomeLoan();
	//abstract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class abstractClass4 {
	public static void main(String args[]) {		
	
	}
}