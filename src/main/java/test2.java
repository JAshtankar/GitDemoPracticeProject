
public class test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		assert false;
		System.out.println("t");
		}catch(Exception e) {
			System.out.println("c");
			throw new Exception();
		}finally {
			System.out.println("f");
		}
		
	}

}
