package PoolSingletonConexaoJDBC;
import java.sql.Connection;

public class PoolConection {
	
	private static PoolConection instances[];
	
	private static int Index;
	private static int length = 5;
	
	private PoolConection() {
		
	}
	
	public static PoolConection getInstance() {
		
		if(instances == null) {
			conection();
		}
		
		Index = (Index + 1) % length;
				
		return instances[Index];
	}

	private static void conection() {
		instances = new PoolConection[length];
		
		for(int i = 0; i < length; i++) {
			instances[i] = new PoolConection();
			Connection con = ConnectionFactory.getConnection();
		}
	}

}
