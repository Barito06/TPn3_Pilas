package tpn3_pilas;
public class TPn3_Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        Pila p2 = new Pila(10);
        Pila p3 = new Pila(10);
        Pila p4 = new Pila(6);
        Pila p5 = new Pila(6);
        Pila p6 = new Pila(6);

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
        
        
        p4.push(9);
        p4.push(5);
        p4.push(3);
        
        p5.push(10);
        p5.push(9);
        p5.push(7);
        
       

       // p1.invierteSimple(p1, p2, p3);
      //p1.invierteEficiente(p1, p3);
      
        //System.out.println(p1.verElemento());
       //p1.invierteEficiente(p1, p2);
       p6.ordenarMayorAMenor(p4, p5, p6);
                       p6.MostrarPila();   

    }
    
}
