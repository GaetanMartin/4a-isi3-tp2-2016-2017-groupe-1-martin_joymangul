package visitor.browser;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;
import visitable.Value;
import visitor.VisitorI;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Prefix extends Browser {

    @Override
    public Value visit(Negation negation) {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
        return null;
    }

    @Override
    public Value visit(Multiplication multiplication) {
        System.out.print(multiplication.getOp());
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
        return null;
    }

    @Override
    public Value visit(Addition addition) {
        System.out.print(addition.getOp());
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
        return null;
    }

    @Override
    public Value visit(Constante constante) {
        System.out.print(constante.getValeur());
        return null;
    }
}
