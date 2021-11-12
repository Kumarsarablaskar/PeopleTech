package practiseR;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;

public class AList {
		public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		Loan lo = new Loan();
		list.add(lo);
		Date da = new Date();
		list.add(da);
		JFrame jf = new JFrame();
		list.add(jf);
		Circle c = new Circle();
		list.add(c);
		for(int i = 0; i < list.size(); ++i) {
		System.out.println(list.get(i).toString());
		}
		
}
}
