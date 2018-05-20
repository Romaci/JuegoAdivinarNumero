package adivinarNumero;

public class AdivinaCompu extends AdivinarNumeroGral{
	
private int sup;
private int inf;
private int med;
private String respuesta;

public AdivinaCompu() {
	super();
}

public void setSup(int s) {
	this.sup= s;
}
public void setInf(int i) {
	this.inf= i;
}
public void setMed() {
	this.med= (this.getInf()+this.getSup())/2;
}

public void setRespuesta(String r) {
	this.respuesta=r;
}

public int getSup() {
	return this.sup;
}
public int getInf() {
	return this.inf;
}
public int getMed() {
	return this.med;
}
public String getRespuesta() {
	return this.respuesta;
}


public void compararNumero(int n) {
	  
	if (this.getRespuesta().equals("+")) {
		this.setInf(this.getMed()+1);
		super.setSeguir(true);
	}
	else {
		if(this.getRespuesta().equals("-")) {
			this.setSup(this.getMed()-1);
			super.setSeguir(true);
		}
		else {
			System.out.println ("Gané");	
			super.setSeguir(false);
		}
	 }
	this.setMed();
  }
}
