package operation.binaire;

import operation.unaire.OperateurUnaire;
import visitable.Noeud;

public abstract class OperateurBinaire  extends OperateurUnaire {

	private Noeud opD;
	
	public OperateurBinaire(String s, Noeud ng, Noeud nd){
		super(s,ng);
		opD=nd;
	}
	
	public Noeud getOpD(){
		return opD;
	}

	@Override
	public int getPriority() {
		return 1;
	}

}
