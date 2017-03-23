package operation;
import visitable.Noeud;
import visitor.Visitor;

public class Multiplication extends OperateurBinaire{

	public Multiplication(Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitMultiplication(this);
	}

	@Override
	public int calculate(Visitor visitor) {
		return visitor.calculateMultiplication(this);
	}
}
