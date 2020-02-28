
public class Aluno {

	//atributos ou propriedades ou variável de instância
	int rm;
	double nota1;
	double nota2;
	String nome;
	
	//Métodos para imprimir os dados do aluno
	public void imprimir() {
		System.out.println("");
		System.out.println("RM -> "+ rm);
		System.out.println("Nome -> "+ nome);
		System.out.println("1° Nota -> "+ nota1);
		System.out.println("2° Nota -> "+ nota2);
		
	}
	
	//método para cálculo e retorno da média
	public double calcularMedia() {
		return ((nota1 + nota2) / 2);	
	}
	
	//método para retornar se é aprovado ou reprovado
	public String verificarSituacao() {
		
		return calcularMedia() >= 6 ? "APROVADO" : "REPROVADO";
	}
}
