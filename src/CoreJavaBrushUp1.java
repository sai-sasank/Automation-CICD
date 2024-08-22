
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 11;
		String name = "sasank";
		char letter = 's';
		double num = 11.22;
		int[] arr = new int[6];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		arr[5] = 66;
		
		int[] arr2 = {11,22,33,44,55,66,77,88,99,200};
		
		for(int i = 0; i<arr2.length; i++) {
			
			
			System.out.println(arr2[i]);
		}
		String[] names = {"sasank" , "sai" , "velagapudi"};
		for(int i = 0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		 for(int i : arr) {
			 System.out.println(i);
		 }
		
		

	}

}
