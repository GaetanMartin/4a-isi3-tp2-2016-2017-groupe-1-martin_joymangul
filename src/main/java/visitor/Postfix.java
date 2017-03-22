package visitor;

import operation.Addition;
import operation.Constante;
import operation.Multiplication;
import operation.Negation;
import visitor.Visitor;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Postfix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        negation.getOpG().accept(this);
        System.out.println(negation.getOp());

    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
        System.out.println(multiplication.getOp());
    }

    @Override
    public void visitAddition(Addition addition) {
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
        System.out.println(addition.getOp());
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.println(constante.getValeur());
    }
}
