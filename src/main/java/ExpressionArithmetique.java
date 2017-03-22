import visitable.Noeud;
import visitor.Infix;
import visitor.Postfix;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
		Postfix postfix = new Postfix();
		this.getRacine().accept(postfix);
		postfix.visit(this.getRacine());
	}

	public int calculerValeur() {
		// TODO 
		return 0;
	}

	public int calculerHauteur() {
		// TODO 
		return 0;
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		Infix infix = new Infix();
		this.getRacine().accept(infix);
		infix.visit(this.getRacine());
		
	}
	
}
