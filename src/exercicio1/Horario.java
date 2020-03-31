package exercicio1;

public class Horario {
	
	private byte hora;
	private byte minuto;
	private byte segundo;
	
	public Horario(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	public byte getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23){
			this.hora = (byte)hora;
		}
	}

	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59){
			this.minuto = (byte)minuto;
		}
	}

	public byte getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59){
			this.segundo = (byte)segundo;
		}
	}

	public void setHora(byte hora) {
		this.hora = hora;
	}

	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(byte segundo) {
		this.segundo = segundo;
	}

	@Override
	public String toString() {
		return "Horario hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "";
	}
	
}
