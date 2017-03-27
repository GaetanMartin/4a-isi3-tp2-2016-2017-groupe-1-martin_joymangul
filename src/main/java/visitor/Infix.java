package visitor;

import operation.*;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Infix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        multiplication.getOpG().accept(this);
        System.out.print(multiplication.getOp());
        multiplication.getOpD().accept(this);
    }

    @Override
    public void visitAddition(Addition addition) {
        addition.getOpG().accept(this);
        System.out.print(addition.getOp());
        addition.getOpD().accept(this);
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.print(constante.getValeur());
    }

    @Override
    public int calculateNegation(Negation negation) {
        return - negation.getOpG().calculate(this);
    }

    @Override
    public int calculateMultiplication(Multiplication multiplication) {
        return multiplication.getOpG().calculate(this) * multiplication.getOpD().calculate(this);
    }

    @Override
    public int calculateAddition(Addition addition) {
        return addition.getOpG().calculate(this) + addition.getOpD().calculate(this);
    }

    @Override
    public int calculateConstant(Constante constante) {
        return constante.getValeur();
    }


}
