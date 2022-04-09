package exercicio1;

public class TelevisaoTeste {

	public static void main(String[] args) {
		
		Televisao televisao = new Televisao();
		ControleRemoto cr = new ControleRemoto(); 
		
		cr.informarInfo(televisao);
		cr.aumentarVolume(televisao);
		cr.diminuirVolume(televisao);
		cr.aumentarCanal(televisao);
		cr.diminuirCanal(televisao);
		cr.mudarCanal(televisao, 69);
		cr.informarInfo(televisao);

	}
}
