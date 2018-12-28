package FactoryMethod;

public class Classification {
	public static void main(String[] args){
		MLClassifierFactory Factory=new MLClassifierFactory();
		ML_Classifier classifier1= Factory.getClassifier("Linear SVC");
		classifier1.getParameters();
		ML_Classifier classifier2= Factory.getClassifier("Polynomial SVC");
		classifier2.getParameters();
		ML_Classifier classifier3= Factory.getClassifier("RBF Kernel SVC");
		classifier3.getParameters();
	}

}
