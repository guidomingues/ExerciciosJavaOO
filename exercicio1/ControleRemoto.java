package exercicio1;

public class ControleRemoto {

	public void aumentarVolume(Televisao tv) { 
		tv.aumentaVolume();
		System.out.println("Volume aumentado + 1: " + tv.getVolume());
	}
	
	public void diminuirVolume(Televisao tv) {
		tv.diminuiVolume();
		System.out.println("Volume diminuido - 1: " + tv.getVolume());
	}
	public void aumentarCanal(Televisao tv) { 
		tv.aumentaCanal();
		System.out.println("Canal aumentado + 1: " + tv.getCanal());
	}
	
	public void diminuirCanal(Televisao tv) {
		tv.diminuiCanal();
		System.out.println("Canal diminuido - 1: " + tv.getCanal());
	}
	public void mudarCanal(Televisao tv, int canal) {
		tv.setCanal(canal);
		System.out.println("Canal alterado para: " + tv.getCanal());
	}
	public void informarInfo(Televisao tv) {
		System.out.println("Informação da TV: \n" + "Canal atual: " + tv.getCanal() + "\nVolume atual: " + tv.getVolume());
	}
}
