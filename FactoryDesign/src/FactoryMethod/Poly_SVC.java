package FactoryMethod;

public class Poly_SVC implements ML_Classifier {
	int[] TrainDataset=new int[10];
	int[] TestDataset=new int[10];
	public void getParameters(){
		int p=4;
		System.out.println("Polynomial SVC parameter");
	}
	public void classify(){
		int s=4;
		System.out.println("Classification by Polynomial SVC");
	}
}
