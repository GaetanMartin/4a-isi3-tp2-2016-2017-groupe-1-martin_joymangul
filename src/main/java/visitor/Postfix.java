package visitor;

import operation.*;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Postfix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        negation.getOpG().accept(this);
        System.out.print(negation.getOp());

    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
        System.out.print(multiplication.getOp());
    }

    @Override
    public void visitAddition(Addition addition) {
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
        System.out.print(addition.getOp());
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.print(constante.getValeur());
    }

    @Override
    public int calculateNegation(Negation negation) {
        return 0;
    }

    @Override
    public int calculateMultiplication(Multiplication multiplication) {
        return 0;
    }

    @Override
    public int calculateAddition(Addition addition) {
        return 0;
    }

    @Override
    public int calculateConstant(Constante constante) {
        return 0;
    }


}
