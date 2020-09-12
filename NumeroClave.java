class NumeroClave{
private int clave;
public NumeroClave (int num){
 clave=num;
}
public void invertirD1D2() {
/*Si clave=dm,...di,...,d1 con m>= 2, invierte d2 y d1*/
    if (clave > 9) {
       int d1 = clave % 10;
       clave = clave / 10;
       int d2 = clave % 10;
       clave = clave / 10;
       clave = (clave*100) + (d1*10) + d2;
    }
    
}
public void invierteDigitos() {
/*Si clave=dm,...di,...,d1 con m>= 2, invierte de modo que al finalizar
clave= d1, d2, ..., dm */
    if (clave > 9) {
        int d1;
        int aux = 0;
        while (clave > 0) {
           d1 = clave % 10;
           aux = (aux*10) + d1;
           clave = clave / 10;
          
        }
        clave = aux;
    }


}
public int obtenerClave(){
 return clave;
}
public int contDigito(int d) {
/* retorna la cantidad de apariciones del dígito d en clave*/
 int aux = clave;
 int cont = 0;
 while (aux !=0) {
     if (d == (aux % 10))
        cont++;
     aux = aux / 10;
    }
 return cont;
}
public boolean estaDigito(int d) {
/* retorna verdadero si d = di para 1<= i <= m y
clave=dm,dm-1,...,d2,d1*/
 if (contDigito(d) > 0)
    return true;
 else return false;


}
public int sumarDigitos() {
/* retorna d1+d2+...+dm-1+dm para clave= dm,dm-1,...,d2,d1*/
 if (clave <= 9)
   return clave;
 else {
   int aux = clave;
   int sum = 0;
   while (aux !=0){
       sum = sum + aux % 10;
       aux = aux / 10;
   }
   return sum;
 }
 
    
}
public int mayorDigito () {
/* retorna dj si dj>=di para 1<=j<= m y para todo i, 1<=i<= m y
clave=dm,dm-1,...,d2,d1*/
 int aux = clave;
 int mayor = clave % 10;
 while (aux !=0){
     aux = aux / 10;
     if ((aux %10)> mayor)
         mayor = aux % 10;
     aux = aux / 10;   
      
        
 }
 return mayor;    
}
public boolean todosIguales() {
/*retorna verdadero si di=di+1 para todo i, 1<=i<m y
clave=dm,dm-1,...,d2,d1*/

int aux = clave;
int ultimo = clave % 10;
int siguiente;
boolean iguales = true;

  while ((aux !=0) && iguales) {
    siguiente = aux  %10;
    if (ultimo != siguiente)
      iguales= false;
    aux= aux / 10;
   
}
return iguales;
}
public boolean dosIguales() {
/*retorna verdadero si di=di+1 para algún i, 1<=i<m y
clave=dm,dm-1,...,d2,d1*/

int aux = clave;
int ultimo = clave % 10;
int siguiente;
boolean dosiguales = false;

  while ((aux !=0) && !dosiguales) {
    aux= aux / 10;
    siguiente = aux  % 10;
    if (ultimo == siguiente)
      dosiguales= true;
    ultimo = siguiente;
   
}
return dosiguales;


}
}
