package exercicio1;

public class Relogio {
	private static Relogio instance;
	private Data data;
	private Horario horario=new Horario(14, 15, 20);

	private Relogio() {
	}

	public static Relogio getInstance() {
		if (instance == null) {
				instance = new Relogio();
			}

		return instance;
	}
	

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Relogio [data=" + data + ", horario=" + horario + "]";
	}
	
	

}
