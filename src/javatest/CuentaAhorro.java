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
public class CuentaAhorro extends Cuenta {
    private double [] Interes;
    private String [] NombreInteres;
    private int maxNumInteres = 5;
    public static int countNumInteres = 0;
    private String TipoCuenta = "Ahorro";
    
    public CuentaAhorro(int NumeroCuenta, int CodigoBanco, int CodigoSucursal) {
        super(NumeroCuenta, CodigoBanco, CodigoSucursal);
        Interes = new double[maxNumInteres];
        NombreInteres = new String[maxNumInteres];
    }
    
    @Override
    public String getTipoCuenta(){
        return TipoCuenta;
    }
    
    public void addInteres(String NombreInteres, double Interes)
    {
        if(this.countNumInteres < this.maxNumInteres){
            this.NombreInteres[countNumInteres] = NombreInteres;
            this.Interes[countNumInteres] = Interes;
            this.countNumInteres++;
        }
        else
        {
        
        }
    }
    
    
    public double SearchInteres(String NombreInteres){
        for (int i = 0; i < this.maxNumInteres; i++) {
            if((this.NombreInteres[i]).equals(NombreInteres)){
                return this.Interes[i];
            }
        }
        return 0;
    }
    
    public void PutSaldoInteres(String NombreInteres)
    {
        double interesResultSearch = SearchInteres(NombreInteres);
        this.Saldo = Saldo - (Saldo * interesResultSearch);
    }
    
}