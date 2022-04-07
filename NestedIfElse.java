package welcomeToJava;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int number =-7;
           
            if(number>0)
            {
            	if(number%2==0)
            	{
            		System.out.println("Number is positive and even");
            	}
            	
            	else
            	{
            		System.out.println("number is positive and odd");
            		
            	}
            }
            else if(number<0) 
            {
            	if(number%2==0)
            	{
            		System.out.println("number is negative and even");
            	}
            	else
            	{
            		System.out.println("number is negative and odd");
            	}
            	
            }
            else 
        	{ 
        		System.out.println("number is zero");
        	}

	}

}
