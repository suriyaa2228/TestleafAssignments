package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6};
		int b[]= {2,3,4,5,6,7};
		
		for(int i=0;i<a.length-1;i++)
		for(int j=0;j<b.length-1;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println("intersection is :"+a[i]);
			}
				
			}
	}

}
