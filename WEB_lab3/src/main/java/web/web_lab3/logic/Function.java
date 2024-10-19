package web.web_lab3.logic;


import lombok.Getter;
import lombok.Setter;

public class Function {
    private final double a;
    @Getter
    private double[] xs;
    @Getter
    private double[] ys;
    @Getter
    @Setter
    private int steps;
    private final double start;
    private final double end;
    private final double step;

    public Function(double a, double start, double end, double step) {
        this.a = a;
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public double solveFunction(double x) {
         double y = 0.0;
        if (x < 1.3){
           y = (Math.PI * x * x) - (7 / (x * x));
        } else if ( x == 1.3){
            y = (this.a * x * x * x) + (7 * Math.sqrt(x));
        } else if (x > 1.3){
            y = Math.log(x +  7 * Math.sqrt(Math.abs(x + a)));
        }
        return y;
    }

    public void countSteps() throws Exception {
        if (step <= 0){
            throw new Exception("Крок має бути більшим за нуль");
        } else if (start > end) {
            throw new Exception("Початок інтервалу має бути меншим або рівним кінцю");
        }
        int steps = (int) Math.round((end - start) / step);
        setSteps(steps + 1);
    }

    public void createXs() {
        this.xs = new double[this.steps];
        xs[0] = start;
        for (int i = 1; i < xs.length; i++) {
            xs[i] = Math.round((xs[i-1] + step) * 1000.0) / 1000.0;
        }
    }

    public void createYs() {
        this.ys = new double[this.steps];
        for (int i = 0; i < ys.length; i++) {
            ys[i] = solveFunction(xs[i]);
        }
    }

    public double getXFromArray(int index) {
        return xs[index];
    }

    public double getYFromArray(int index) {
        return ys[index];
    }

    public int findMaxY() {
        double max = ys[0];
        int maxIndex = 0;
        for (int i = 1; i < ys.length; i++) {
            if (ys[i] > max) {
                max = ys[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int findMinY() {
        double min = ys[0];
        int minIndex = 0;
        for (int i = 1; i < ys.length; i++) {
            if (ys[i] < min) {
                min = ys[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public double findSum() {
        double result = 0;
        for (double y : ys) {
            result += y;
        }
        return result;
    }
    
    public double findArithmeticMean() {
        return findSum() / ys.length;
    }

    public void calculate() throws Exception {
        countSteps();
        createXs();
        createYs();
    }
}

