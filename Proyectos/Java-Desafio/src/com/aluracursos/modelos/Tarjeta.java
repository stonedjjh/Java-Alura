package com.aluracursos.modelos;

public class Tarjeta {
    private double limite;
    private double deuda = 0;

    public Tarjeta(double limite){
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDeuda() {
        return this.deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void aumentarLimite(double nuevoLimite){
        if (this.getLimite() > nuevoLimite) {
            System.out.println("No puede disminuir el limite actual");
            return;
        }
        else
            this.setLimite(nuevoLimite);
    }

    private boolean comprobarCredito(double monto){
        if (this.getLimite()> (this.getDeuda()+monto))
            return true;
        return false;
    }

    public boolean realizarCargo(double monto)
    {
        if (this.comprobarCredito(monto)) {
            this.setDeuda(this.getDeuda()+monto);
            return true;
        }
        return false;
    }

    public void realizarPago(double monto){
        if (this.getDeuda() >  monto){
            this.setDeuda(this.getDeuda()-monto);
        }
        else{
            var diferencia  =  monto - getDeuda();
            this.setDeuda(0);
            this.setLimite(getLimite()+diferencia);
        }

    }
}
