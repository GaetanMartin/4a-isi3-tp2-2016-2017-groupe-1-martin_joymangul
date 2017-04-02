package visitor.calculator;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;

/**
 * Created by Gaetan on 02/04/2017.
 */
public class ValueCalculator implements Calculator {
    
    @Override
    public Integer calculateNegation(Negation negation) {
        return -negation.getOpG().accept(this);
    }

    @Override
    public Integer calculateMultiplication(Multiplication multiplication) {
        return multiplication.getOpG().accept(this) * multiplication.getOpD().accept(this);
    }

    @Override
    public Integer calculateAddition(Addition addition) {
        return addition.getOpG().accept(this) + addition.getOpD().accept(this);
    }

    @Override
    public Integer calculateConstante(Constante constante) {
        return constante.getValeur();
    }
}
