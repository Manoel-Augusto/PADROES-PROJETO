package exercicio1;

public class Data {

	private byte dia;
	private byte mes;
	private short ano;

	public Data(short ano, byte mes, byte dia) {
		if (validaAno(ano) && validaMes(mes) && validaDia(dia) == true) {
			if (fevereiro28(ano, mes, dia) == true || fevereiro29(ano, mes, dia) == true || dia30(mes, dia) == true
					|| dia31(mes, dia) == true) {
				setAno(ano);
				setMes(mes);
				setDia(dia);

			} else
				padrao();

		} else
			padrao();

	}

	private void padrao() {
		setAno((short) 1);
		setDia((byte) 1);
		setMes((byte) 1);

	}

	public short getAno() {
		return ano;
	}

	public byte getMes() {
		return mes;
	}

	public byte getDia() {
		return dia;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public void setDia(byte dia) {

		this.dia = dia;
	}

	// Validar se ano está no intervalo correto.
	public boolean validaAno(short ano) {
		if (ano > 0 && ano <= 9999) {
			return true;
		}
		return false;

	}

	// Validar se o ano atende aos parametros para ser BISSEXTO.
	public boolean checaAnoBissexto(short ano) {

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 400 == 0) {

			return true;

		} else
			return false;
	}

	// Validar se MES está no intervalo correto.
	public boolean validaMes(byte mes) {

		if (mes > 0 && mes <= 12) {

			return true;
		}
		return false;
	}

	// Validar se DIA está no intervalo correto.
	public boolean validaDia(byte dia) {
		if (dia > 0 && dia <= 31) {

			return true;
		}
		return false;
	}

	// FEVEREIRO
	public boolean fevereiro28(short ano, byte mes, byte dia) {
		if ((mes == 2) && (checaAnoBissexto(ano) == false) && (dia <= 28)) {
			return true;

		}

		return false;

	}

	public boolean fevereiro29(short ano, byte mes, byte dia) {
		if (mes == 2 && checaAnoBissexto(ano) == true && dia <= 29) {
			return true;
		}
		return false;
	}

	public boolean dia30(byte mes, byte dia) {
		if (dia <= 30 && mes == 4 || dia <= 30 && mes == 6 || dia <= 30 && mes == 9 || dia <= 30 && mes == 11) {
			return true;

		}
		return false;

	}

	public boolean dia31(byte mes, byte dia) {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31) {
			return true;
		}
		return false;

	}

	
	



	@Override
	public String toString() {
		return "Data Dia=" + dia + ", Mes=" + mes + ", Ano=" + ano + "";
	}

}