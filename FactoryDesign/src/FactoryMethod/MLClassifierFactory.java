package FactoryMethod;

public class MLClassifierFactory {
	public ML_Classifier getClassifier(String ClassifierType){
		if (ClassifierType==null){
			return null;
			}
		if (ClassifierType.equalsIgnoreCase("Linear SVC")){
			return new Linear_SVC();
		}
		if (ClassifierType.equalsIgnoreCase("RBF Kernel SVC")){
			return new RBF_Kernel_SVC();
		}
		if (ClassifierType.equalsIgnoreCase("Polynomial SVC")){
			return new Poly_SVC();
		}
	return null;
	}

}
