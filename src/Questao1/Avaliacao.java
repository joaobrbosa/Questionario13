package Questao1;

public class Avaliacao {
	private String tipo;
	private double nota;

	public Avaliacao(String tipo, double nota) {
		if (nota <= 0) {
			throw new IllegalArgumentException("Nota inválida. A nota deve ser maior que zero.");
		}
		this.tipo = tipo;
		this.nota = nota;
	}

	public String getTipo() {
		return tipo;
	}

	public double getNota() {
		return nota;
	}
}
