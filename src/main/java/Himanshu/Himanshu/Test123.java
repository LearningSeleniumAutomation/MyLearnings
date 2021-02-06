package Himanshu.Himanshu;

public class Test123 {

	
	public static int testTryCatch()
	{
		int num,num1 = 0;
		try {
			num=10;
			num1=10;
			int x = num/num1;
			return x;
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
			return -1;
		}
		finally {
			System.out.println("Hello Tanmay");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = testTryCatch();
		System.out.println("value is " +x);
		
	}

}
