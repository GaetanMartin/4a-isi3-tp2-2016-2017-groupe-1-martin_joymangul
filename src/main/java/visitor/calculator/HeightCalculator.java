package visitor.calculator;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;

/**
 * Created by Gaetan on 02/04/2017.
 */
public class HeightCalculator implements Calculator {

    @Override
    public Integer calculateNegation(Negation negation) {
        return 1 + negation.getOpG().accept(this);
    }

    @Override
    public Integer calculateMultiplication(Multiplication multiplication) {
        return 1 + Math.max(multiplication.getOpG().accept(this), multiplication.getOpD().accept(this));
    }

    @Override
    public Integer calculateAddition(Addition addition) {
        return 1 + Math.max(addition.getOpG().accept(this), addition.getOpD().accept(this));
    }

    @Override
    public Integer calculateConstante(Constante constante) {
        return 1;
    }
}
