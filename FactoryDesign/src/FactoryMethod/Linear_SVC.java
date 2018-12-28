package FactoryMethod;

public class Linear_SVC implements ML_Classifier {
	int[] TrainDataset=new int[10];
	int[] TestDataset=new int[10];
	public void getParameters(){
		int p=2;
		System.out.println("Linear SVC parameter");
	}
	public void classify(){
		int s=2;
		System.out.println("Classification by Linear SVC");
	}

}
