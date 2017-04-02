package operation.binaire;
import visitable.Noeud;
import visitor.browser.Visitor;
import visitor.calculator.Calculator;

public class Multiplication extends OperateurBinaire{

	public Multiplication(Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitMultiplication(this);
	}

	@Override
	public int accept(Calculator visitor) {
		return visitor.calculateMultiplication(this);
	}

	@Override
	public int getPriority() {
		return 2;
	}
}
