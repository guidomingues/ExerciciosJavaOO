package exercicio2;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
	Aluno aluno = new Aluno("Rodrigo", 123456, 10, 5, 6); 

	aluno.getNome();
	aluno.getMatricula(); 
	aluno.getNota1(); 
	aluno.getNota2();
	aluno.getNotaDeTrabalho();
	
	System.out.println(aluno.toString());
	
	System.out.println(aluno.media());
	}
}
