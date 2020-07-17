package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Oferta {
	private double oferta;
	private Date data;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Oferta() {
	}
	public Oferta(Double oferta, Date data) {
		this.oferta = oferta;
		this.data = data;
	}
	public Double getOferta() {
		return oferta;
	}
	public Date getData() {
		return data;
	}
	@Override
	public String toString() {
		return "\nOferta: " + oferta + "\ndata da Oferta: " + sdf.format(data) ;
	}
	
}
