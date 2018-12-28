package FactoryMethod;

public class DesignPatternClassification {
	public static void main(String[] args){
		MLClassifierFactory Factory=new MLClassifierFactory();
		System.out.println("Welcome to ML classifier system\n");
		ML_Classifier classifier1= Factory.getClassifier("Linear SVC");
		classifier1.getParameters();
		classifier1.classify();
		System.out.println("\n");
		ML_Classifier classifier2= Factory.getClassifier("RBF Kernel SVC");
		classifier2.getParameters();
		classifier2.classify();
		System.out.println("\n");
		ML_Classifier classifier3= Factory.getClassifier("Polynomial SVC");
		classifier3.getParameters();
		classifier3.classify();
		System.out.println("\n");
	}

}
