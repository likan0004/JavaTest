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
public class CuentaCorriente extends Cuenta{
    private double Sobregiro;
    private double SobregiroTotal;
    private String TipoCuenta = "Corriente";

    public CuentaCorriente(int NumeroCuenta, int CodigoBanco, int CodigoSucursal) {
        super(NumeroCuenta, CodigoBanco, CodigoSucursal);
    }
        
    @Override
    public String getTipoCuenta(){
        return TipoCuenta;
    }

    public double getSobregiro(){
       return Sobregiro;
    }
    public void setSobregiro(int Sobregiro){
        this.Sobregiro = Sobregiro;
    }
    public double getSobregiroTotal(){
        return this.SobregiroTotal;
    }
    
    public boolean isSobregiro(){
        if (this.SobregiroTotal-this.Sobregiro != 0) {
            return false;
        }
        return true;
    }
    
    /**
     *
     * @param Retiro
     */
    @Override
    public void RetirarSaldo(double Retiro){
        if(this.Saldo == 0){
            RetirarSaldoSobregiro(Retiro);
        }
        else
            super.RetirarSaldo(Retiro); 
    }
    
    public void RetirarSaldoSobregiro(double RetiroSobregiro){
        if((this.Sobregiro-RetiroSobregiro)>0)
        this.Sobregiro = this.Sobregiro - RetiroSobregiro;
        //ELSE
    }
}
