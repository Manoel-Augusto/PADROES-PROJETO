package PoolSingletonConexaoJDBC;
import java.sql.Connection;

public class ConectarJDBC {
	
	public void teste () {
		Connection con = ConnectionFactory.getConnection();
	}

}
