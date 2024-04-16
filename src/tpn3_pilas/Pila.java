package tpn3_pilas;

import java.util.Scanner;

/*
Implemente la clase pila, se trata de una pila de enteros, la misma debe contener
los métodos: push(), pop(), pilaVacia(), PilaLlena(), verElemento()
Cree un objeto de la clase y verifique sus métodos.
 */
public class Pila {
    
    private int n = 10;
    private int[] pila;
    private int tope = -1;
    private Scanner Leer = new Scanner(System.in);
    
    public Pila() {
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
 
    public void push(int x) {
        if (tope < n - 1) {
            tope++;
            pila[tope] = x;
            //System.out.println(pila[tope]);
        } else {
            System.out.println("La estructura esta completa, no se puede insertar");
        }
    }

    public void pop() {
        if (tope >= 0) {
            tope--;
        } else {
            System.out.println("La estructura esta vacia, no se puede eliminar");
        }
    }

    public boolean pilaVacia() {
        return tope == -1;
    }

    public boolean pilaLlena() {
        return tope == n-1;
    }

    public int verElemento() {
        return pila[tope];
    }
    
    public void invierteSimple(){
    
        Pila p2 = new Pila();
        Pila p3 = new Pila(); 
        
        for (int j = 0; j < n; j++) {
            int s = verElemento();
            pop();
            p2.push(s);
        }
        
        for (int j = 0; j < n; j++) {
            int a = p2.verElemento();
            p2.pop();
            p3.push(a);
        }
        for (int j = 0; j < n; j++) {
            int b = p3.verElemento();
            p3.pop();
            push(b);
        }    
    }
    
    public void invierteEficiente(){
    int aux;
    Pila pAux =new Pila();
    
    aux = verElemento();
    for (int j = 0; j < n; j++) {
            int s = verElemento();
            pop();
            pAux.push(s);
        }
    
    }
}
