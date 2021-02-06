package Himanshu.Himanshu;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Himanshu");
		Queue<String> qu = new LinkedList<String>();
	//	qu.add(e)
		EnumerationTest en = new EnumerationTest();
		en.EnumerationTest(al);
	}

	public void EnumerationTest(ArrayList<String> al) {
		Enumeration<String> en = Collections.enumeration(al);

		while (en.hasMoreElements()) {

			System.out.println(en.nextElement());
		}
	}
}
