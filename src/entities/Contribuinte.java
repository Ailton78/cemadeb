package entities;

import java.util.ArrayList;
import java.util.List;

public class Contribuinte extends Pessoa {
	
	private Congregacoes congregacao;

	List<Oferta> ofertas = new ArrayList<Oferta>();

	public Contribuinte(String name, String sexo, int idade, Congregacoes congregacao) {
		super(name, sexo, idade);
		this.congregacao = congregacao;
	}

	public Congregacoes getCongregacao() {
		return congregacao;
	}

	public void setCongregacao(Congregacoes congregacao) {
		this.congregacao = congregacao;
	}
	public List<Oferta> getOfertas() {
		return  ofertas;
	}
	public void addOferta(Oferta oferta) {
		ofertas.add(oferta);
	}

	@Override
	public String toString() {
		return getCongregacao() 
				+ "\nName: " + getName() 
				+ "\nSexo: " + getSexo() 
				+ "\nIdade: " + getIdade()
				+ ofertas;

	}

}
