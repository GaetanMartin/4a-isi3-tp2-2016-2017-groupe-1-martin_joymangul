package visitor;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;
import visitable.Value;

/**
 * Created by p1509413 on 22/03/2017.
 */
public interface VisitorI {

    Value visit(Negation negation);

    Value visit(Multiplication multiplication);

    Value visit(Addition addition);

    Value visit(Constante constante);

//    int visit(Negation negation);
//
//    int visit(Multiplication multiplication);
//
//    int visit(Addition addition);
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
