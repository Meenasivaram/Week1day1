package week1Day2;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int nums[]= {45,77,66,77,66,78};
	
	for (int i=0; i<nums.length;i++)
		
	{
		
		for (int j=i+1;j<nums.length;j++) {
			
			if(nums[i]==nums[j])
			{
				System.out.println(nums[i]);
			}
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
