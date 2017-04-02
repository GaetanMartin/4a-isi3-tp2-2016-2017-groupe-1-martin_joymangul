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
public class Postfix extends Browser {

    @Override
    public Value visit(Negation negation) {
        negation.getOpG().accept(this);
        System.out.print(negation.getOp());

        return null;
    }

    @Override
    public Value visit(Multiplication multiplication) {
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
        System.out.print(multiplication.getOp());
        return null;
    }

    @Override
    public Value visit(Addition addition) {
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
        System.out.print(addition.getOp());
        return null;
    }

    @Override
    public Value visit(Constante constante) {
        System.out.print(constante.getValeur());
        return null;
    }


}
