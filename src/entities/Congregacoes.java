package entities;

public class Congregacoes {
	private String nome;
	private int distrito;
	
	public Congregacoes() {
	}
	public Congregacoes(String nome, int distrito) {
		this.nome = nome;
		this.distrito = distrito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDistrito() {
		return distrito;
	}
	public void setDistrito(int distrito) {
		this.distrito = distrito;
	}
	@Override
	public String toString() {
		return "\nCongregação: " + nome + "\ndistrito: " + distrito ;
	}
	
}
