package visitor.browser;

import operation.*;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Prefix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        System.out.print(multiplication.getOp());
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
    }

    @Override
    public void visitAddition(Addition addition) {
        System.out.print(addition.getOp());
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.print(constante.getValeur());
    }
}
