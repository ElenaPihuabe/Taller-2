
package taller2;

import java.util.Date;


public class Cuenta {

    private int id = 0;
    private double saldo =0 ;
    double retiro=0;
    double deposito=0;
    private double interesAnual = 0;
    private Date fechaCreacion;
    
    public void  cuenta () {}
    public void cuenta (int id, double saldo,double retito,double deposito) {
    this.id = id ;
    this.saldo = saldo ;   
    }
    public int getId() {
        return id;   
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getInteresAnual() {
        return interesAnual;
    }
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public double getInteresMensual () {
       double r1 = this.saldo * 0.045 ;
       return r1 ; 
    }
    public double Retiro () {
       double r2 = this.saldo - (retiro + deposito) ;
       return r2;
    }
    public double Deposito () {
    double r3 = this.saldo + deposito ; 
    return r3;
    }
    public void mostrar (){
        System.out.println("ID:" +this.getId () );
        System.out.println("Saldo:" +this.getSaldo());
        System.out.println("RETIRO: " +this.retiro);
        System.out.println("DEPOSITO: "+deposito);
        System.out.println("Interes Mensual:" +this.getInteresMensual ());
    }
    public static void main(String[] args) {
        Cuenta p1 = new Cuenta ();
        p1.id = 1122;
        p1.saldo = 20000;
        p1.retiro= 2500;
        p1.deposito= 3000;
        p1.mostrar () ;
    }
    
}
