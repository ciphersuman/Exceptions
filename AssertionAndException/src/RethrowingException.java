import java.io.IOException;
import java.sql.SQLException;

public class RethrowingException {
	
	
	
	public static void rethrow () throws  SQLException , IOException
	{
		try {
			m1();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} 
	}
	

	
	public static void m1() throws SQLException , IOException
	{
		
	}
}
