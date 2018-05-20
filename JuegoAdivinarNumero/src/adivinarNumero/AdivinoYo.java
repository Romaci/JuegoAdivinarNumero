package adivinarNumero;

public class AdivinoYo extends AdivinarNumeroGral{

private int nro;
	
public AdivinoYo() {
	super();
}
	public void setNum(int aux) {
		this.nro = aux;
	}

public void compararNumero (int n) {
		if (n<this.nro) {
			System.out.println ("Mi número es más grande");
			super.setSeguir(true);
		}
		else {
			if (n>this.nro) {
				System.out.println ("Mi número es más chico");
				super.setSeguir(true);
			}
		 else {
				System.out.println ("Ganaste");
				super.setSeguir(false);
			}
		}
	 }
	
	

	
}

