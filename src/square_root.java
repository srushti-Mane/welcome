public class square_root {
    public static double sqrtDubious(double c) {
        if (c > 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err)  // is the absolute diff almost 0?
            t = (c / t + t) / 2.0;
        return t;
    }
}
