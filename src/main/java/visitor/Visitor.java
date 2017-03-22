package visitor;

import operation.Addition;
import operation.Constante;
import operation.Multiplication;
import operation.Negation;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import visitable.Visitable;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitor {



    void visitNegation(Negation negation);

    void visitMultiplication(Multiplication multiplication);

    void visitAddition(Addition addition);

    void visitConstant(Constante constante);

    default void visit(Visitable visitable) {
    }

}
