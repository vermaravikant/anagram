import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ana {
	
	public static void main(String[] args)
	{
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s1 = new String(br.readLine());
			String s2 = new String(br.readLine());
			System.out.println("" +s1);
			System.out.println("" +s2);
			boolean check =isanagram(s1,s2);
			System.out.println("" + check);
		}
		
		catch(Exception ex)
		{
		   System.out.println("" + ex);	
		}
		
		
		
	}

	private static boolean isanagram(String s1, String s2) {
		
		
		// TODO Auto-generated method stub
		if(s1.length() != s2.length())
		    return false;
		char [] array1 = s1.toCharArray();
		char [] array2 = s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		int i =0;
		int j= 0;
		String s  = new String(array1);
		String s3 = new String(array2);
		return s.equals(s3)?true:false;
	}

}
