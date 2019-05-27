package ej2;

public class Urna {

	private int blancas;
	private int negras;

	public Urna(int blancas, int negras) {
		this.blancas = blancas;
		this.negras = negras;

	}

	public int getBlancas() {
		return blancas;
	}

	public void setBlancas(int blancas) {
		this.blancas = blancas;
	}

	public int getNegras() {
		return negras;
	}

	public void setNegras(int negras) {
		this.negras = negras;
	}

	public void MeteBola(int numeroDeBolas) {

		this.blancas += numeroDeBolas;
		this.negras += numeroDeBolas;

	}

	public boolean quedanBolas(int blancas, int negras) {
		boolean hayBolas = false;
		if (blancas > 0) {
			hayBolas = true;
		} else if (negras > 0) {
			hayBolas = true;
		}
		return hayBolas;
	}

	public void sacaBola(int colorBola) {

		if (colorBola == blancas) {

			System.out.println("El color de la bola es blanca");
			blancas = blancas - 1;
		} else if (colorBola == negras) {
			System.out.println("El color de la bola es negra");
			negras = negras - 1;

		}

	}

	public boolean quedaMasDeUnaBola(int blancas, int negras) {
		boolean hayBolas = false;
		if (blancas > 1) {
			hayBolas = true;
		} else if (negras > 1) {
			hayBolas = true;
		}
		return hayBolas;
	}

	public void totalBolas(int blancas, int negras) {

		int totalBolas;

		totalBolas = blancas + negras;

	}

}
