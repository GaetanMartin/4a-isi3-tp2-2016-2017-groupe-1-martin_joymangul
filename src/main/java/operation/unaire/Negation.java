package operation.unaire;
import visitable.Noeud;
import visitor.browser.Visitor;
import visitor.calculator.Calculator;

public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitNegation(this);
	}

	@Override
	public int accept(Calculator visitor) {
		return visitor.calculateNegation(this);
	}

	@Override
	public int getPriority() {return 3;}
}
