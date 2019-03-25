/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author VSOne
 */
public class Cuenta {
    protected int NumeroCuenta;
    protected int CodigoBanco;
    protected int CodigoSucursal;
    protected double Saldo;
    protected String TipoCuenta = "Normal";
    
    public Cuenta (int NumeroCuenta, int CodigoBanco, int CodigoSucursal){
        this.NumeroCuenta = NumeroCuenta;
        this.CodigoBanco = CodigoBanco;
        this.CodigoSucursal = CodigoSucursal;
    }
    public int getNumeroCuenta(){
        return NumeroCuenta;
    }
    public int getCodigobanco(){
        return CodigoBanco;
    }
    public int getCodigoSucursal(){
        return CodigoSucursal;
    }
    public void setCodigoNumeroCuenta(int NumeroCuenta){
        this.NumeroCuenta = NumeroCuenta;
    }
    public void setCodigoBanco(int CodigoBanco){
        this.CodigoBanco = CodigoBanco;
    }
    public void setCodigoSucursal(int CodigoSucursal){
        this.CodigoSucursal = CodigoSucursal;
    }
    public double getSaldo(){
        return this.Saldo;
    }
    public String getTipoCuenta(){
        return TipoCuenta;
    }
    public void DepositarSaldo(double Deposito){
        Saldo = Saldo + Deposito;
    }
    public void RetirarSaldo(double Retiro){
        Saldo = Saldo - Retiro;
    }
}
