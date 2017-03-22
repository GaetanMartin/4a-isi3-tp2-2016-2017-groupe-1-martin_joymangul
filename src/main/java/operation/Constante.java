package operation;

import visitable.Noeud;
import visitor.Visitor;

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
	public String toString() {
		return String.valueOf(valeur);
	}
}
