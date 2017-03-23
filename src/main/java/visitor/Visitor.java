package visitor;

import operation.*;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitor {

    void visitNegation(Negation negation);

    void visitMultiplication(Multiplication multiplication);

    void visitAddition(Addition addition);

    void visitConstant(Constante constante);

    int calculateNegation(Negation negation);

    int calculateMultiplication(Multiplication multiplication);

    int calculateAddition(Addition addition);

    int calculateConstant(Constante constante);

    int height(Constante constante);

    int height(OperateurBinaire oB);

    int height(OperateurUnaire oU);

}
