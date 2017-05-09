
package taller3;

public class Triangulo extends ObjetoGeometrico{

    double lado1=1;
     double lado2=2;
     double lado3=3;

    public Triangulo ()  {}
    
    public Triangulo (double lado1,double lado2,double lado3) {
       super.lado1 = lado1;
       super.lado2 = lado2;
       super.lado3 = lado3;
    } 
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
  
    public double getArea() {
         double r1 = lado1+lado2 / 2 ;
         return r1 ;
     }
    public double getPerimetro() {
        double r2 = lado1 + lado2 + lado3;
        return r2;
    }
    public void mostrar (){
        System.out.println("LADO 1:" +this.getLado1());
        System.out.println("LADO 2:"+this.getLado2());
        System.out.println("LADO 3:" +this.getLado3 ());
        System.out.println("EL PERIMETRO ES:"+this.getPerimetro ());
        System.out.println("EL AREA ES:"+this.getArea ()) ; 
        
    }
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo () ;
        t1.setLado1 (1); 
        t1.setLado2 (1.5);
        t1.setLado3 (1);  
        t1.mostrar ();
    }
    
}
