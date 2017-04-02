package operation.binaire;
import visitable.Noeud;
import visitor.browser.Visitor;
import visitor.calculator.Calculator;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitAddition(this);
	}

	@Override
	public int accept(Calculator visitor) {
		return visitor.calculateAddition(this);
	}

}
