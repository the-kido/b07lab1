public class Polynomial
{
    double[] coefficients;

    public Polynomial()
    {
        coefficients = new double[1];
    }
    
    public Polynomial(double[] coefficients)
    {
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial added)
    {
        int maxSize = added.coefficients.length < coefficients.length ? coefficients.length : added.coefficients.length;
        
        double[] sum = new double[maxSize];
        
        for (int i = 0; i < coefficients.length; i++) sum[i] += coefficients[i];
        
        for (int i = 0; i < added.coefficients.length; i++) sum[i] += added.coefficients[i];

        return new Polynomial(sum);
    }

    public double evaluate(double x)
    {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) result += coefficients[i] * Math.pow(x, i);
        return result;
    }

    public boolean hasRoot(double x)
    {
        return evaluate(x) == 0;
    }
}