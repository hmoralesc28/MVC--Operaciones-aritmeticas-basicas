package model;

public class Modelo {

    private int numeroUno;
    private int numeroDos;
    private double resultado;

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void multiplicar(){

        this.resultado = (double) this.numeroUno * this.numeroDos;

    }

    public void dividir(){

        this.resultado = (double) this.numeroUno / this.numeroDos;

    }


    public void sumar(){

        this.resultado = (double) this.numeroUno + this.numeroDos;

    }

    public void restar(){

        this.resultado = (double) this.numeroUno - this.numeroDos;

    }





}

