package visitor;

import operation.Addition;
import operation.Constante;
import operation.Multiplication;
import operation.Negation;
import visitor.Visitor;

/**
 * Created by p1509413 on 22/03/2017.
 */
public class Infix implements Visitor {

    @Override
    public void visitNegation(Negation negation) {
        negation.getOpG().accept(this);
        System.out.println(negation.getOp());
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
}
