package midJan;

public class question_3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] X = {"ceo","alco","caaeio","ceai"};
			String[] Y = {"ec","oc","ceo"};
			String y = "",str = "";
			int count = 0;
			
			for(String s : Y)
				y += s;
			for(char ch : y.toCharArray())
				if(str.indexOf(ch) == -1)
					str += ch;
				else
					continue;
			
			for(int i=0;i<X.length;i++) {
				if(findSprStr(X[i] , str))
					count++;
				else
					continue;
			}
			System.out.println(count);
		}
		public static boolean findSprStr(String s , String str) {
			for(int i=0;i<str.length();i++) {
				if(s.indexOf(str.charAt(i)) == -1)
					return false;
			}
			return true;
		}
		
	}
	


				
				

