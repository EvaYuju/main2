package com.main.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuenta {
    private String numCuenta;
    private String titular;
    private Date fechaApertura;
    private double saldo;


    public Cuenta(String numCuenta, String titular, String fechaApertura, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        SimpleDateFormat format =  new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.fechaApertura = format.parse(fechaApertura);
        } catch (ParseException e) {
            throw new RuntimeException("Error al procesar la fecha");
        }
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
