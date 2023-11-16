package KI305.Fedus.Lab4;

/**
 * The CalculateTheEquationInterface interface defines methods for calculating mathematical equations.
 */
public interface CalculateTheEquationInterface {

    /**
     * Calculates the result of the equation 1/sin(x).
     *
     * @param variable The input value for the equation.
     * @return The result of the equation 1/sin(x).
     */
    double doCalculation(double variable);

    /**
     * Takes user input and calculates the result of the equation 1/sin(x).
     *
     * @return The result of the equation 1/sin(x) based on user input.
     */
    double doCalculationWithInputInside();
}
