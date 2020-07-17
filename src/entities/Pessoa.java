package entities;

public class Pessoa {
	private String name;
	private String sexo;
	private int idade;
	
	public Pessoa() {
	}

	public Pessoa(String name, String sexo, int idade) {
		this.name = name;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Nome: " + name + ", sexo: " + sexo + ", idade: " + idade + "anos";
	}
	
}
