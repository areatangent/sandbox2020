package ru.ssau.tk.areatangent.sandbox2020;

public final class CartesianComplex implements Complex {

    private final double re;
    private final double im;

    public CartesianComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public double re() {
        return re;
    }

    @Override
    public double im() {
        return im;
    }

    @Override
    public double abs() {
        return Math.sqrt(re * re + im * im);
    }

    @Override
    public double arg() {
        return Math.atan2(im, re);
    }

    @Override
    public Complex plus(Complex other) {
        return new CartesianComplex(re + other.re(), im + other.im());
    }

    @Override
    public Complex minus(Complex other) { return new CartesianComplex(re - other.re(), im - other.im()); }

    @Override
    public Complex times(Complex other) {
        return null;
    }

    @Override
    public Complex divide(Complex other) {
        return null;
    }
}
