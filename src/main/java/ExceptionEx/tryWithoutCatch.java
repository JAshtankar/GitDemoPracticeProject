package ExceptionEx;

public class tryWithoutCatch {
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[5]=30/0;    
             System.out.println(a[10]);  
            }finally {
            	  System.out.println("rest of the code");    
            }//catch(ArithmeticException | ArrayIndexOutOfBoundsException | Exception ex){
               // logger.error(ex);
            // throw new MyException(ex.getMessage());
         //}
                 
          
 }  
}
