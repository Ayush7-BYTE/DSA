//Finding the value 5 for how many times it is repeated
class array_repeated_value  
{
	public static void main(String[] args) 
	{
		int[] arr={10,5,6,9,5,8,5,4,1,2,9};
		int count=0;
		for(int i=0; i<=10;i++)
		{
			if(arr[i]==5)
			{
				count++;
			}
		}
		System.out.println("5 is present for "+ count + " times");
	}
}
