package FactoryMethod;

public class ConventionalClassification {
	public static void main(String[] args){
		Linear_SVC classifier1=new Linear_SVC();
		System.out.println("Welcome to ML classifier system\n");
		classifier1.getParameters();
		classifier1.classify();
		System.out.println("\n");
		RBF_Kernel_SVC classifier2=new RBF_Kernel_SVC();
		classifier2.getParameters();
		classifier2.classify();
		System.out.println("\n");
		Poly_SVC classifier3=new Poly_SVC();
		classifier3.getParameters();
		classifier3.classify();
		System.out.println("\n");
	}
}
