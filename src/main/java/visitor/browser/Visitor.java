package visitor.browser;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface Visitor {

    void visitNegation(Negation negation);

    void visitMultiplication(Multiplication multiplication);

    void visitAddition(Addition addition);

    void visitConstant(Constante constante);

//    int calculateNegation(Negation negation);
//
//    int calculateMultiplication(Multiplication multiplication);
//
//    int calculateAddition(Addition addition);
//
//    int calculateConstant(Constante constante);
//
//    default int height() {
//        return 1;
//    }
//
//    default int height(OperateurBinaire oB) {
//        int left = oB.getOpG().height(this) + 1;
//        int right =  oB.getOpD().height(this) + 1;
//        return  Math.max(left,right);
//    }
//
//    default int height(OperateurUnaire oU) {
//        return oU.getOpG().height(this) + 1;
//    }

}
