package stringExample;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj=new ReverseString();
		obj.reverseMe("Twisha");
		obj.reverseMe("umesh");
		obj.reverseMe("JYOTI");
	}

	public String reverseMe(String strOrg) {
		String strRev="";
		try {
			for(int i=strOrg.length()-1;i>=0;i--) {
				strRev=strRev+strOrg.charAt(i);
			}
			System.out.println(strRev+" is reverse of "+strOrg);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return strRev;
		
	}
}
