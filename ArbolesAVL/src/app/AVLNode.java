package app;

public class AVLNode<T> implements Comparable<T> {
    public T dato;      	 // el dato del nodo
    public AVLNode<T> izquierdo;            // hijo izquierdo
    public AVLNode<T> derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNode( T dato ){
        this( dato, null, null );
    }

    public AVLNode( T dato, AVLNode<T> izq, AVLNode<T> der ){
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }

	@Override
	public int compareTo(T arg0) {
		
		return 0;
	}
}
