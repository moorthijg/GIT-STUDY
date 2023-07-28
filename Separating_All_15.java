package Interview_Questions;

public class Separating_All_15 {

	public static void main(String[] args) {
		
		StringBuffer alpha = new StringBuffer() ,num = new StringBuffer(), spc = new StringBuffer();
		String s = "Good1234867@#^*643$%^MORNING";
		
		int a = s.length();
		
		System.out.println(a);
		
		for(int i= 0;i<a;i++) {
			if(Character.isDigit(s.charAt(i)))
				num.append(s.charAt(i));
			else if (Character.isAlphabetic(s.charAt(i)))
				alpha.append(s.charAt(i));
			else
			{
				spc.append(s.charAt(i));
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spc);

	}

}
