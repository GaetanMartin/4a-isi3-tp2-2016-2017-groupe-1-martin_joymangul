package operation.unaire;

import visitable.Noeud;
import visitable.Value;
import visitor.VisitorI;

public class Constante implements Noeud {
	private Value valeur;

	public Constante(int v){
		valeur = new Value(v);
	}

	public Constante(Value v) { valeur = v;}

	public Value getValeur(){return valeur;}

	@Override
	public Value accept(VisitorI visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return String.valueOf(valeur);
	}
}
