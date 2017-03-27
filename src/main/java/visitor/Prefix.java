package visitor;

import operation.*;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Prefix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        System.out.print(negation.getOp());
        System.out.print(negation.getOpG());
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        System.out.print(multiplication.getOp());
        System.out.print(multiplication.getOpG());
        System.out.print(multiplication.getOpD());
    }

    @Override
    public void visitAddition(Addition addition) {
        System.out.print(addition.getOp());
        System.out.print(addition.getOpG());
        System.out.print(addition.getOpD());
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
