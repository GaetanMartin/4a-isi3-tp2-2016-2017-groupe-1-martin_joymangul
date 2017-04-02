package expression;

import visitable.Noeud;
import visitor.browser.Infix;
import visitor.browser.InfixParentheses;
import visitor.browser.Postfix;
import visitor.browser.Prefix;
import visitor.calculator.Calculator;
import visitor.calculator.HeightCalculator;
import visitor.calculator.ValueCalculator;

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
	}

	public void afficherPreFixe() {
		System.out.println("\n prefixe:");
		Prefix prefix = new Prefix();
		this.getRacine().accept(prefix);
	}

	public int calculerValeur() {
		ValueCalculator valueCalculator = new ValueCalculator();
		return this.getRacine().accept(valueCalculator).getValue();
	}

	public int calculerHauteur() {
		HeightCalculator heightCalculator = new HeightCalculator();
		return this.getRacine().accept(heightCalculator).getValue();
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		Infix infix = new Infix();
		this.getRacine().accept(infix);

	}

    public void afficherInFixeParenthesis() {
		System.out.println("\n infixe parenthesis:");
		InfixParentheses infix = new InfixParentheses();
		this.getRacine().accept(infix);
    }
}
