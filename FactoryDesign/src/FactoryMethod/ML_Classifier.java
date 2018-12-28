package FactoryMethod;

public interface ML_Classifier {
	int[] TrainDataset=new int[10];
	int[] TestDataset=new int[10];
	
	public void getParameters();
	
	public void classify();
	

}
