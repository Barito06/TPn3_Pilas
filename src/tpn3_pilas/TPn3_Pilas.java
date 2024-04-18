package tpn3_pilas;
public class TPn3_Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        Pila p2 = new Pila(10);
        Pila p3 = new Pila(10);
        Pila p4 = new Pila(5);
        Pila p5 = new Pila(5);
        Pila p6 = new Pila(10);

        p1.push(1);        
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);
        p1.push(6);
        p1.push(7);
        p1.push(8);
        p1.push(9);
        p1.push(10);
        
       

       // p1.invierteSimple(p1, p2, p3);
      //p1.invierteEficiente(p1, p3);
      
        //System.out.println(p1.verElemento());
       p1.invierteEficiente(p1, p2);
       p1.MostrarPila();   
                
    }
    
}
