public class Math {
    /**
     * Adds two numbers together.
     * @param a is the first variable to add.
     * @param b is the second variable to add.
     * @return The sum of a and b.
     */
    public double add(double a, double b){
        return a + b;
    }

    /**
     * Subtracts two numbers.
     * @param a The first number.
     * @param b The number being subtracted from a.
     * @return The difference between a and b.
     */
    public double subtract(double a, double b){
        return a - b;
    }

    /**
     * Multiplies two numbers together.
     * @param a The first number being multiplied.
     * @param b The second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b){
        return a*b;
    }

    /**
     * Divides two numbers.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient.
     */
    public double divide(double a, double b){
        return a/b;
    }

    /**
     * Returns the remainder of integer division problem.
     * @param a The dividend.
     * @param b The divisor.
     * @return The remainder of the division.
     */
    public int remainder(int a, int b){
        return a%b;
    }
}
