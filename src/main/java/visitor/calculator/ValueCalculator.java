package visitor.calculator;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;
import visitable.Value;

/**
 * Created by Gaetan on 02/04/2017.
 */
public class ValueCalculator extends Calculator {
    
    @Override
    public Value visit(Negation negation) {
        return negation.getOpG().accept(this).neg();
    }

    @Override
    public Value visit(Multiplication multiplication) {
        return multiplication.getOpG().accept(this).multiply(multiplication.getOpD().accept(this));
    }

    @Override
    public Value visit(Addition addition) {
        return addition.getOpG().accept(this).add(addition.getOpD().accept(this));
    }

    @Override
    public Value visit(Constante constante) {
        return constante.getValeur();
    }
}
