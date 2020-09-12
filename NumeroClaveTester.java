
public class NumeroClaveTester{ 
        
    public static void main (String args[]){
      NumeroClave n = new NumeroClave(2452);
      System.out.println("El nro clave es:"+ n.obtenerClave());
      //prueba invertirD1D2
      n.invertirD1D2();
      System.out.println("El nro clave invertidoD1D2 es:"+ n.obtenerClave());
      //prueba invertir digitos
      n.invierteDigitos();
      System.out.println("El nro clave con sus dígitos invertidos es:"+ n.obtenerClave());
      //prueba cont digitos
      int cont= n.contDigito(2);
      System.out.println("La cantidad de apariciones del dígito 2 es: "+cont);
      //prueba estaDigito
      boolean esta=n.estaDigito(9);
      System.out.println("¿Aparece el dígito 9?: "+esta);  
      //prueba sumar digitos
      int suma= n.sumarDigitos();
      System.out.println("La suma de sus dígitos es: "+suma);
      //prueba mayor digito
      int mayor=n.mayorDigito();
      System.out.println("El mayor de sus dígitos es: "+mayor);
      //prueba todos iguales
      boolean iguales=n.todosIguales();
      System.out.println("Tiene todos sus digitos iguales?: "+iguales);
      //prueba dos iguales
      boolean dosIguales=n.dosIguales();
      System.out.println("Tiene al menos dos dígitos consecutivos iguales?: "+dosIguales);
      
      
    }           
}