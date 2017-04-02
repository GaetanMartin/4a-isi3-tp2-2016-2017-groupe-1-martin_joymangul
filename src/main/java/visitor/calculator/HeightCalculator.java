package visitor.calculator;

import operation.binaire.Addition;
import operation.binaire.Multiplication;
import operation.unaire.Constante;
import operation.unaire.Negation;
import visitable.Value;

/**
 * Created by Gaetan on 02/04/2017.
 */
public class HeightCalculator extends Calculator {

    @Override
    public Value visit(Negation negation) {
        return negation.getOpG().accept(this).add(1);
    }

    @Override
    public Value visit(Multiplication multiplication) {
        return multiplication.getOpG().accept(this).max(multiplication.getOpD().accept(this)).add(1);
    }

    @Override
    public Value visit(Addition addition) {
        return addition.getOpG().accept(this).max(addition.getOpD().accept(this)).add(1);
    }

    @Override
    public Value visit(Constante constante) {
        return new Value(1);
    }
}
