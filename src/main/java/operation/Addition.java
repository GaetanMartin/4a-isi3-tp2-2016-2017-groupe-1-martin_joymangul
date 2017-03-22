package operation;
import visitable.Noeud;
import visitor.Visitor;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitAddition(this);
	}

}
