package operation.unaire;

import visitable.Noeud;

public abstract class OperateurUnaire implements Noeud {
	private String op;
	private Noeud opG;
	
	protected OperateurUnaire(String s, Noeud n){
		op=s;
		opG=n;
	}
	public String getOp(){
		return op;
	}
	public Noeud getOpG(){
		return opG;
	}

	@Override
	public int getPriority() {
		return 1;
	}

	@Override
	public String toString() {
		return this.getOp();
	}

}
