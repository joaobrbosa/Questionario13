package Questao1;

public class BimestreTesteMain {
	public static void main(String[] args) {
		try {
			Avaliacao avaliacao1 = new Avaliacao("Prova", 8.5);
			Avaliacao avaliacao2 = new Avaliacao("Seminário", 7.0);
			Avaliacao avaliacao3 = new Avaliacao("Estudo Dirigido", 0); // Nota inválida, deve lançar uma exceção

			System.out.println("Avaliações cadastradas com sucesso.");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			System.out.println("Corrigindo nota para 10.0 pontos.");
			Avaliacao avaliacao3 = null;
			try {
				avaliacao3 = new Avaliacao("Estudo Dirigido", 10.0);
			} catch (IllegalArgumentException ex) {
				// Caso ocorra uma exceção novamente, trate-a de acordo com as regras da
				// aplicação
				System.out.println("Erro ao corrigir a nota: " + ex.getMessage());
			}
		}
	}
}
