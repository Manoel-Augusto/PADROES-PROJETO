package PoolSingletonConexaoJDBC;
import java.sql.Connection;

public class TestBanco {

	public static void main(String[] args) {
		//Connection con = ConnectionFactory.getConnection();
		
		for(int i = 0; i < 10; i++) {
			PoolConection s = PoolConection.getInstance();
			System.out.println(s);
		}

	}

}
