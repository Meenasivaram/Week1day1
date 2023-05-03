package week1Day2;

public class Fibbinocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,sum,count=20;
        int i;
		
		System.out.println(n1+""+n2);
		//System.out.println(n2);
		
		for (i=2;i<count;i++)
		{
			
		sum=n1+n2;
		System.out.println(""+sum);
		
		n1=n2;
		
		n2=sum;	
		}
		
		
		
	}

}
