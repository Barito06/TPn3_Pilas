package tpn3_pilas;

/*
Implemente la clase pila, se trata de una pila de enteros, la misma debe contener
los métodos: push(), pop(), pilaVacia(), PilaLlena(), verElemento()
Cree un objeto de la clase y verifique sus métodos.
 */
public class Pila {

    private int n;
    private int[] pila;
    private int tope = -1;

    public Pila(int n) {
        this.n = n;
        pila = new int[n];
    }
//getters
    public int getN() {
        return n;
    }
    public int[] getPila() {
        return pila;
    }
    public int getTope() {
        return tope;
    }

    public int push(int x) {
        if (tope < n - 1) {
            tope++;
            pila[tope] = x;
            //System.out.println("El numero introducido es: " + x);
        } else {
            System.out.println("La estructura esta completa, no se puede insertar");
        }
        return x;
    }

    public int pop() {
        if (tope >= 0) {
            //System.out.println("El numero retirado es: " + tope);
            tope--;
        } else {
            System.out.println("La estructura esta vacia, no se puede eliminar");
        }
        return tope;
    }

    public boolean pilaVacia() {
        return tope == -1;
    }

    public boolean pilaLlena() {
        return tope == n - 1;
    }

    public int verElemento() {
        int var = pila[tope];
        return var;
    }

    public void MostrarPila() {
        for (int i = 0; i < n; i++) {
            System.out.println(pila[i]);
        }
    }

    public void invierteSimple(Pila p1, Pila p2, Pila p3) {

        while (!p1.pilaVacia()) {
            p2.push(p1.verElemento());
            p1.pop();
        }
        while (!p2.pilaVacia()) {
            p3.push(p2.verElemento());
            p2.pop();
        }
        while (!p3.pilaVacia()) {
            p1.push(p3.verElemento());
            p3.pop();
        }
    }

    public void invierteEficiente(Pila p1, Pila pAux){
        /*
        Voy a hacer de cuenta que tengo un arreglo p1 con los siguientes valores
        [1,2,3,4,5]
        */
    int aux;    
    // asignamos a la variable auxiliar el tope de la pila 1 (Segun el ejemplo el valor seria 5).
        for (int k = 0; k < n; k++) {
            
    aux = verElemento();
    // Pasamos todos los valores de la pila 1 a la pila 2 y en el camino vaciamos la pila 1.
    // Nos quedaria p1[0,0,0,0,0] y pAux[5,4,3,2,1]    
    for (int i = 0; i < n; i++) {
        if(!pAux.pilaLlena()){
            pAux.push(p1.verElemento());
            p1.pop();
        }
    }
    //Ahora el valor de la variable aux se lo introducimos en la p1(pila original)
            p1.push(aux);
    // Aqui se devuelven los valores a la pila inicial, con la diferencia que solo se ingresan 4 de los 5 valores
    // por los que la pila1 queda como p1[5,1,2,3,4]
        
        for (int j = 0; j < n; j++) {
            if(!p1.pilaLlena()){
            p1.push(pAux.verElemento());
            pAux.pop();
        }
        }
        }
    }
}