package FactoryMethod;

public class RBF_Kernel_SVC implements ML_Classifier {
	int[] TrainDataset=new int[10];
	int[] TestDataset=new int[10];
	public void getParameters(){
		int p=3;
		System.out.println("RBF Kernel SVC parameter");
	}
	public void classify(){
		int s=3;
		System.out.println("Classification by RBF Kernel SVC");
	}

}
