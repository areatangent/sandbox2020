package ru.ssau.tk.areatangent.sandbox2020;

public interface Complex {

    double re();

    double im();

    double abs();

    double arg();

    Complex plus(Complex other);

    Complex minus(Complex other);

    Complex times(Complex other);

    Complex divide(Complex other);

}
