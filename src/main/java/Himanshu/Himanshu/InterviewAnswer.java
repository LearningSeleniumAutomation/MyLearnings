package Himanshu.Himanshu;

import java.util.Collection;

public class InterviewAnswer implements Interview{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interview in = new InterviewAnswer();
		in.setName("Tanmay");
		in.getname();
		//in.Question
		Integer i = new Integer(10);
		Integer i1 = new Integer(10);
		System.out.println(i.hashCode());
		System.out.println(i1);
		
	}
//interface
	public void setName(String name) {
		System.out.println(name);
		
	}
//interface
	public void getname() {
		// TODO Auto-generated method stub
		System.out.println("Hello this getname");
	}
//class method
	public void Question(int number)
	{
		System.out.println(number);
	}
}
