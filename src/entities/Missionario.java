package entities;

public class Missionario extends Pessoa {
	
	private final Integer RG;
	private final Integer CPF;
	
	
	public Missionario(String name, String sexo, int idade, Integer RG, Integer CPF) {
		super(name, sexo, idade);
		this.RG = RG;
		this.CPF = CPF;
	}
	public Integer getRG() {
		return RG;
	}
	public Integer getCPF() {
		return CPF;
	}
	@Override
	public String toString() {
		return  "\nName: " + getName() 
				+ "\nRG:" + RG 
				+ "\nCPF: " + CPF
				+ "\nSexo: " + getSexo()
				+ "\nIdade: " + getIdade() 	;
				
	}
	
}
