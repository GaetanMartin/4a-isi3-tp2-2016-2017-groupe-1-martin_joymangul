import expression.ExpressionArithmetique;
import operation.binaire.Addition;
import operation.unaire.Constante;
import operation.binaire.Multiplication;
import operation.unaire.Negation;
import visitable.Noeud;

public class TestArbreBinaire {

	public static void main(String[] args) {
		//faire 1+2*3+-4=3
		Addition racine = new Addition(new Addition(new Constante(1),
					new Multiplication(new Constante(2),new Constante(3))),
					new Negation(new Constante(4)));
		ExpressionArithmetique exp = new ExpressionArithmetique(racine);

		exp.afficherInFixe();
		System.out.println("\n calcul valeur: " + exp.calculerValeur());
		System.out.println("\n calcul hauteur: " + exp.calculerHauteur());
		exp.afficherPostFixe();
		exp.afficherPreFixe();

		// 7*(5+(-2))=21
		Noeud racine2 = new Multiplication(
				new Constante(7),
				new Addition(new Constante(5), new Negation(new Constante(2)))
		);
		ExpressionArithmetique exp2 = new ExpressionArithmetique(racine2);
		exp2.afficherInFixeParenthesis();

	}

	

}
