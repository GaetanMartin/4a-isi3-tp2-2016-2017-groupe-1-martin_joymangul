package operation.binaire;
import visitable.Noeud;
import visitable.Value;
import visitor.VisitorI;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	@Override
	public Value accept(VisitorI visitor) {
		return visitor.visit(this);
	}

}
