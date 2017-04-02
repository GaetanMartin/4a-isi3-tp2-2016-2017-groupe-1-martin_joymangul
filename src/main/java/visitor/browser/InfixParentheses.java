package visitor.browser;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Negation;
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

    private void displayNode(int currentPriority, Noeud node) {
        if (node.getPriority() > 0 && currentPriority > node.getPriority()) {
            displayNodeBetweenParentheses(node);
        } else {
            node.accept(this);
        }
    }

    @Override
    public void visitNegation(Negation negation) {
        System.out.print("(");
        System.out.print(negation.getOp());
        displayNode(negation.getPriority(), negation.getOpG());
        System.out.print(")");

    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        displayNode(multiplication.getPriority(), multiplication.getOpG());
        System.out.print(multiplication.getOp());
        displayNode(multiplication.getPriority(), multiplication.getOpD());
    }

    @Override
    public void visitAddition(Addition addition) {
        displayNode(addition.getPriority(), addition.getOpG());
        System.out.print(addition.getOp());
        displayNode(addition.getPriority(), addition.getOpD());
    }
}
