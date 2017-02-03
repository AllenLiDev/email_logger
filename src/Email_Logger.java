import org.apache.log4j.Logger;

public class Email_Logger {
	
	static Logger log = Logger.getLogger(Email_Logger.class);
	
	public static void main (String args[]){
		System.out.println("testing");
		try{
			log.error("email this");
		}catch(Exception ex){
			System.out.println("exception caught: " + ex.getMessage());
		}
		System.out.println("Ending");
	}
}
