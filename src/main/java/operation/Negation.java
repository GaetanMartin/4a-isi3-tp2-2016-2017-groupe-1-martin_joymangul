package operation;
import visitable.Noeud;
import visitor.Visitor;

public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitNegation(this);
	}

	@Override
	public int calculate(Visitor visitor) {
		return visitor.calculateNegation(this);
	}
}
