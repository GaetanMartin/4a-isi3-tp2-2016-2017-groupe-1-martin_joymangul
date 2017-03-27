package visitor;

import operation.Addition;
import operation.Constante;
import operation.Multiplication;
import operation.Negation;
import visitable.Noeud;

/**
 * Created by Gaetan on 27/03/2017.
 * Question 6
 */
public class InfixParentheses extends Infix {

    private void displayNodeBetweenParentheses(Noeud node) {
        System.out.print("(");
        node.accept(this);
        System.out.print(")");
    }

    private void displayNode(Noeud node) {
        if (node instanceof Addition) {
            displayNodeBetweenParentheses(node);
        } else {
            node.accept(this);
        }
    }

    @Override
    public void visitNegation(Negation negation) {
        System.out.print("(");
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
        System.out.print(")");

    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        displayNode(multiplication.getOpG());
        System.out.print(multiplication.getOp());
        displayNode(multiplication.getOpD());
    }
}
