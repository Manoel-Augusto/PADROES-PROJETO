package Adapter;

public class Principal {

	public static void main(String[] args) {

		InterfaceData d = new DataAdapter(new Data((byte) 8, (byte) 5, (short) 2020));
		System.out.println(d.toString());
	}

}
