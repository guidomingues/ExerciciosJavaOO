package exercicio2;

public class Aluno {
	
	private int matricula; 
	private String nome; 
	private double nota1; 
	private double nota2; 
	private double notaDeTrabalho;
	
	public double media() {
		
		return (((this.nota1 + this.nota2) * 1.5) + (notaDeTrabalho * 2)) / 5;
		
	}
	
	public Aluno(String nome, int matricula, double nota1, double nota2, double notaDeTrabalho) {
		
		this.nota1 = nota1;
		this.nota2 = nota2; 
		this.notaDeTrabalho = notaDeTrabalho; 
		this.nome = nome; 
		this.matricula = matricula; 
	
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaDeTrabalho() {
		return notaDeTrabalho;
	}
	public void setNotaDeTrabalho(double notaDeTrabalho) {
		this.notaDeTrabalho = notaDeTrabalho;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", notaDeTrabalho=" + notaDeTrabalho + "]";
	}
	
	

}
