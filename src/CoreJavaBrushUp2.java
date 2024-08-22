import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {11,22,33,44,55,66,77,88,99,200};
		for(int i = 0; i<arr2.length; i++) {
			if(arr2[i] % 2==0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i]+ "is not a multiple of 2");
				
				ArrayList<String> a = new ArrayList<String>();
				a.add("Sai");
				a.add("Sasank");
				a.add("Velagapudi");
				a.add("Selenium");
				a.remove(2);
				System.out.print(a.remove(2));
				a.get(0);
				System.out.print(a.get(0));
			}
		}
	}

}
