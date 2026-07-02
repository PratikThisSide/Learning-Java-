package day_3;

public class Test_MathsOperation2 {

	public static void main(String[] args) {
		MathsOperations mObj = new MathsOperations();
		
		mObj.add();
		
		int no = mObj.getNumber();
		System.out.println("Number: " + no);
		
		int a = 10, b=67;
		mObj.sum(a, b);
		
		mObj.sum(22, 33);
		
		
		
	}

}