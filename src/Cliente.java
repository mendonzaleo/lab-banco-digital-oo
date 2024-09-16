
public class Cliente {

	private String nome;
	private int numeroConta = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta++;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
}
