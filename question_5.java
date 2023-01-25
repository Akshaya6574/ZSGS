package midJan;
import java.util.*;

public class question_5 {

	public static void main(String[] args) {
		String s="hello world please";
		s=s.toLowerCase();
		String refstr="help";
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
				continue;
		if(!m.containsKey(c))
			m.put(c, 0);
		m.put(c, m.get(c)+1);
		}
		for(int i=0;i<refstr.length();i++)
		{
		if(m.containsKey(refstr.charAt(i)))	
		{
			System.out.println(refstr.charAt(i)+"="+m.get(refstr.charAt(i)));
		}
		}
			
		
	
	}

}
