package Tutorial;

public class Practice {
	
	public void abc()
	{
		for(int i=40;i>=30;i--)
		{
			if(i!=35)
			{
				System.out.println(i);
			}
		 }
			
	 }
		
	
	public void xyz()
	{
		String a="softtech";
	    
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.println("");
	}
	public int pqr()
	{
		int arr[]=new int[5];
		arr[0]=105;
		arr[1]=70;
		arr[2]=300;
		arr[3]=440;
		arr[4]=50;
		
		int max=arr[0];
		
		for(int i=1;i<5;i++)
			
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
		}
		return max;
				
	 }
	
	public String str(String a,String b)
	
    {
		System.out.println(a.concat(b));
		return a;
		
		
	}

	public static void main(String[] args) {
		
		Practice p=new Practice(); 
		
		p.abc(); //non static method without return type and 0 arguments
					//print 40 to 30 except 35 number 
		
		p.xyz(); //non static method without return type and String arguments
					//reverse string 

        System.out.println(p.pqr()); ////non static method with return type and 0 arguments
										//return maximum number from array
		
		
        p.str("softtech","class"); //non static method with String  type and multiple arguments
        
	}

}
