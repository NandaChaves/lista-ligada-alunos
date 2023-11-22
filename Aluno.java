package exemplo1_1_Listas;

public class Aluno {
	private int numero;
	private String nome;
	private Aluno proxAl;
	/**
	 * @param numero o número do aluno
	 * @param nome o nome do aluno
	 */
	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	/**
	 * @return the proxAl
	 */
	public Aluno getProxAl() {
		return proxAl;
	}
	/**
	 * @param proxAl a referencia do novo proxAl
	 */
	public void setProxAl(Aluno proxAl) {
		this.proxAl = proxAl;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	
}
