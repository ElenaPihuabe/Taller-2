
package taller.pkg1;

public class Rectangulo {

    double ancho = 1 ;
    double altura  = 1 ;
    public void Rectangulo () {
    }
    
    public void Rectangulo (double ancho, double altura) {
    this.ancho = ancho ;
    this.altura = altura; 
    }
    public double getPerimetro(){
    double res = 2*(this.ancho * this.altura);
    return res ;
    }
    public double getArea () {
    double respuesta1 = this.ancho * this.altura;
    return respuesta1 ;
    }    
    public void mostrar () {
    System.out.println ("LA ALTURA ES:"	+this.ancho);
    System.out.println ("EL ANCHO ES:" 	+this.altura);
    System.out.println("EL PERIMETRO ES:" +this.getPerimetro());
    System.out.println("EL AREA ES:" +this.getArea()); 
    }
    public static void main(String[] args) {
    Rectangulo test = new Rectangulo () ;
    test.altura = 4 ;
    test.ancho = 40 ;
    test.getArea() ;
    test.getPerimetro() ;
    test.mostrar();
    
    
    System.out.println("CALCULO DE AREA Y PERIMETRO DEL TRIANGULO");
    Rectangulo test1=new Rectangulo ();
    test1.altura = 3.5;
    test1.ancho = 35.9;
    test1.mostrar ();
    }
    
}
