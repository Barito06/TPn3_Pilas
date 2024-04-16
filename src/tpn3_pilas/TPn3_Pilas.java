package tpn3_pilas;
public class TPn3_Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila();
        p1.push(0);
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);
        p1.push(6);
        p1.push(7);
        p1.push(8);
        p1.push(9);
         
        p1.invierteSimple();
        
        System.out.println(p1.verElemento());
      
//       System.out.println("El elemento en el tope es: " + p1.verElemento());
//        System.out.println("La pila esta vacia?" + p1.pilaVacia());
        
        
    }
    
    
    
}
