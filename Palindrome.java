package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pal="radar";
		String rev="";
		for(int i=pal.length()-1;i>=0;i--)
		{
			rev=rev+pal.charAt(i);
		}
		if(rev.equalsIgnoreCase(pal))
				{
			System.out.println("palindrome");
				}else {
					System.out.println("not palindrome");
				}
	}

}
