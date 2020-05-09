package Adapter;

public class DataAdapter implements InterfaceData {
	Data data;

	public DataAdapter(Data data) {
		this.data = data;
	}

	public void setContrutor(short ano, byte mes, byte dia) {

		this.data = new Data((byte) dia, (byte) mes, (short) ano);
	};

	public void setDataMes(byte mes) {

		data.setMes(mes);

	}

	@Override
	public void setDiaMes(byte dia, byte mes) {
		data.setDia(dia);
		data.setMes(mes);

	}

	@Override
	public void setMesAno(byte mes, short ano) {
		data.setMes(mes);
		data.setAno(ano);

	}

	@Override
	public void setDiaAno(byte dia, short ano) {
		data.setDia(dia);
		data.setAno(ano);
	}

	@Override
	public void setDiaMesAno(byte dia, byte mes, short ano) {
		data.setDia(dia);
		data.setMes(mes);
		data.setAno(ano);

	}

	@Override
	public String toString() {
		return "DataAdapter [Data=" + data + "]";

	}

}