package visitable;

public interface Noeud extends Visitable {

    default int getPriority() {return 0;}
	
}
