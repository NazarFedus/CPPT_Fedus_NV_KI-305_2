package KI305.Fedus.Lab5;

/**
 * The CalculateTheEquationInterface provides methods for calculating mathematical equations.
 */
public interface CalculateTheEquationInterface {
    /**
     * Calculates the result of the equation 1/sin(x).
     *
     * @param value The input value for the equation.
     * @return The result of the equation 1/sin(x).
     */
    double doCalculation(double value);

    /**
     * Takes user input and calculates the result of the equation 1/sin(x).
     *
     * @return The result of the equation 1/sin(x) based on user input.
     */
    double doCalculationWithInputInside();
}
