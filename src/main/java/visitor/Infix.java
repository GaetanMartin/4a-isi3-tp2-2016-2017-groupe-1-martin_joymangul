package visitor;

import operation.*;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Infix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        System.out.println(negation.getOp());
        negation.getOpG().accept(this);
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        multiplication.getOpG().accept(this);
        System.out.println(multiplication.getOp());
        multiplication.getOpD().accept(this);
    }

    @Override
    public void visitAddition(Addition addition) {
        addition.getOpG().accept(this);
        System.out.println(addition.getOp());
        addition.getOpD().accept(this);
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.println(constante.getValeur());
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

    @Override
    public int height(Constante constante) {
            return 1;
    }

    @Override
    public int height(OperateurBinaire oB) {
        int left = oB.getOpG().height(this) + 1;
        int right =  oB.getOpD().height(this) + 1;
        return  Math.max(left,right);
    }

    @Override
    public int height(OperateurUnaire oU) {
        return oU.getOpG().height(this) + 1;
    }


}
