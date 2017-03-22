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
        System.out.println(negation.getOpG());
        System.out.println(negation.getOp());
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        System.out.println(multiplication.getOpG());
        System.out.println(multiplication.getOp());
        System.out.println(multiplication.getOpD());
    }

    @Override
    public void visitAddition(Addition addition) {
        System.out.println(addition.getOpG());
        System.out.println(addition.getOp());
        System.out.println(addition.getOpD());
    }

    @Override
    public void visitConstant(Constante constante) {
        System.out.println(constante.getValeur());
    }
}
