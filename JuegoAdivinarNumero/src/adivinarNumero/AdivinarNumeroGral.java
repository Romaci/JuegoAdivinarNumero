package adivinarNumero;

public abstract class AdivinarNumeroGral {
	private boolean seguir = true;


public void setSeguir(boolean aux) {
	this.seguir=aux;
}

public boolean getSeguir () {
	return this.seguir;
}


public boolean continuar() {
	return this.seguir;
}

public abstract void compararNumero(int aux);

}
