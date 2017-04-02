package operation.binaire;
import visitable.Noeud;
import visitable.Value;
import visitor.VisitorI;

public class Multiplication extends OperateurBinaire{

	public Multiplication(Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	@Override
	public Value accept(VisitorI visitor) {
		return visitor.visit(this);
	}

	@Override
	public int getPriority() {
		return 2;
	}
}
