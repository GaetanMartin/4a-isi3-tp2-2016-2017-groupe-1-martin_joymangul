package visitor.calculator;

import operation.*;

/**
 * Created by Gaetan on 02/04/2017.
 */
public interface Calculator {

    Integer calculateNegation(Negation negation);

    Integer calculateMultiplication(Multiplication multiplication);

    Integer calculateAddition(Addition addition);

    Integer calculateConstante(Constante constante);
}