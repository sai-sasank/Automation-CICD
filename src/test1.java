import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aravind");
		names.add("Abhishek");
		names.add("sujeeth");
		names.add("Suresh");
		names.add("Ajith");
		int count = 0;
		for(int i = 0;i<names.size();i++)
		{
			String actual =names.get(i);
			if(actual.endsWith("A"))
			{
				count++;
			}
		}

	}




public void streamFilter()
{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Aravind");
	names.add("Abhishek");
	names.add("sujeeth");
	names.add("Suresh");
	names.add("Ajith");
	names.stream().filter(s->s.startsWith("A"));
}}