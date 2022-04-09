package exercicio1;


/* 
 * Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
▪aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
▪aumentar e diminuir o número do canal em uma unidade
▪trocar para um canal indicado;
▪consultar o valor do volume de som e o canal selecionado.

 */

public class Televisao {

	private int volume;
	private int canal;
	
	public Televisao() { 
		this.canal = 10; 
		this.volume = 16;
	}
	
	public int getVolume() {
		return volume;
	}
	public void aumentaVolume() {
		this.volume ++;
	}
	public void diminuiVolume() {
		this.volume --;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	} 
	public void aumentaCanal() {
		this.canal ++;
	} 
	public void diminuiCanal() {
		this.canal --;
	} 
}
