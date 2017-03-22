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
        System.out.println(negation.getOpG());
        System.out.println(negation.getOp());

    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        System.out.println(multiplication.getOpG());
        System.out.println(multiplication.getOpD());
        System.out.println(multiplication.getOp());
    }

    @Override
    public void visitAddition(Addition addition) {
        System.out.println(addition.getOpG());
        System.out.println(addition.getOpD());
        System.out.println(addition.getOp());
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.println(constante.getValeur());
    }
}
