package exercicio1;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("********************MESMA INSTANCIA DE OBJETO********************");
		Relogio relogio = Relogio.getInstance();
		relogio.setData(new Data((short) 2020, (byte) 3, (byte) 29));
		relogio.setHorario(new Horario (15,7,40));
		
		Relogio relogio1 = Relogio.getInstance();
		relogio1.setData(new Data((short) 2019, (byte) 4, (byte) 15));
		relogio1.setHorario(new Horario (9,3,16));
	
		
		System.out.println(relogio.toString());
		System.out.println(relogio1.toString());
		
		
		System.out.println("*****************************************************************");
		System.out.println();
		System.out.println("********************DATA/HORARIO # RELOGIO #***********************");
		
		System.out.println("DATA: " + relogio.getData().getDia() + "/" + relogio.getData().getMes() + "/" + relogio.getData().getAno());
		System.out.println("HORÁRIO: " + relogio.getHorario().getHora() + ":" + relogio.getHorario().getMinuto() + ":" + relogio.getHorario().getSegundo());
		
		System.out.println("********************DATA/HORARIO # RELOGIO 1 #**********************");
		
		System.out.println("DATA: " + relogio1.getData().getDia() + "/" + relogio1.getData().getMes() + "/" + relogio1.getData().getAno());
		System.out.println("HORÁRIO: " + relogio1.getHorario().getHora() + ":" + relogio1.getHorario().getMinuto() + ":" + relogio1.getHorario().getSegundo());
		System.out.println("***********RELOGIO 1 É O SEGUNDO OBJETO PORÉM COMO JÁ HAVIA INSTANCIADO O OBJETO #RELOGIO# ANTERIORMENE*************");
		System.out.println("***********O PADRÃO APLICADO NÃO DEIXA QUE UMA NOVA INSTANCIA SEJA GERADA*********************");
		
		System.out.println();
		System.out.println("**********************toString**********************");
		System.out.println();
		System.out.println(relogio.toString());
		System.out.println(relogio1.toString());
	
	}
}
