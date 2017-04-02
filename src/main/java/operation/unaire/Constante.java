package operation.unaire;

import visitable.Noeud;
import visitor.browser.Visitor;
import visitor.calculator.Calculator;

public class Constante implements Noeud {
	private int valeur;
	public Constante(int v){
		valeur = v;
	}
	public int getValeur(){return valeur;}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConstant(this);
	}

	@Override
	public int accept(Calculator visitor) {
		return visitor.calculateConstante(this);
	}

	@Override
	public String toString() {
		return String.valueOf(valeur);
	}
}
