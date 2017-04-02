package operation.unaire;
import visitable.Noeud;
import visitable.Value;
import visitor.VisitorI;

public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}

	@Override
	public Value accept(VisitorI visitor) {
		return visitor.visit(this);
	}

	@Override
	public int getPriority() {return 3;}
}
