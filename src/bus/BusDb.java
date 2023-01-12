package bus;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
public class BusDb {
	
	public static void busInfo() throws SQLException {
//		System.out.println("hii");
		String query="SELECT * FROM bus";
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet result=st.executeQuery(query);
		while(result.next()) {
			System.out.print(result.getInt(1)+" ");
			if(result.getInt(2)==0) {
				System.out.print("Ac No ");
				
			}
			else {
				System.out.print("Ac Yes");
			}
			System.out.print("capacity:"+result.getInt(3));
			System.out.println();
			
		}
	}
}
