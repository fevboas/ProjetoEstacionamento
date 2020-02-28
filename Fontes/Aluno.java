
public class Aluno {

	//atributos ou propriedades ou vari�vel de inst�ncia
	int rm;
	double nota1;
	double nota2;
	String nome;
	
	//M�todos para imprimir os dados do aluno
	public void imprimir() {
		System.out.println("");
		System.out.println("RM -> "+ rm);
		System.out.println("Nome -> "+ nome);
		System.out.println("1� Nota -> "+ nota1);
		System.out.println("2� Nota -> "+ nota2);
		
	}
	
	//m�todo para c�lculo e retorno da m�dia
	public double calcularMedia() {
		return ((nota1 + nota2) / 2);	
	}
	
	//m�todo para retornar se � aprovado ou reprovado
	public String verificarSituacao() {
		
		return calcularMedia() >= 6 ? "APROVADO" : "REPROVADO";
	}
}
