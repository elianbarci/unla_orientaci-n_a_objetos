package modelo;

public class Punto {

	private double x,y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";		//Hay que redifinir equals y toString
	}
	
	public double calcularDistancia (Punto p) {
		double aux = 0;
		int x1=0;
		int y1=0;
		
		x1=p.getX();
		y1=p.getY();
		
		aux=
		
		return aux;
	}

	public boolean equals(Punto p){
		return ((x==p.getX())&&(y==p.getY()));
		}
	 




	 

	
	/*	
	 *Diferencia entre Polimorfismo y Sobrecarga
	 *	Sobrecarga:
	 * 		Se envian diferentes parametros o tipos de parametros pero el cuerpo es el mismo
	 *	
	 *	Polimorfismo:
	 *		Se cambia el cuerpo del metodo.
	 *En ambos casos la firma, es decir, el nombre del metodo es el mismo.
	 *
	 *LOS OBJETOS SE COMPARAN CON EQUALS
	 *
	 *Hay variables primitivas y variables de clase
	 *
	 *	Las clases pueden tener atributos aunque tambi�n pueden tener atributos de variables de clase.
	 *
	 *Entre clases puede haber diferentes relaciones que son representadas en UML:
	 *		
	 *		Composici�n:
	 *				
	 *				Si limpio memoria en el objeto que contiene a la otra clase, se libera
	 *				tambien el objeto contenido.
	 *				
	 *
	 *		Agregaci�n:
	 * 				
	 *				Porque cada clase es independiente, no desaparece si se elimina una.
	 *
	 *El m�todo equals(), se utiliza para comparar dos objetos. Ojo no confundir con el 
	 * operador ==, que ya sabemos que sirve para comparar tambien, equals compara si dos objetos apuntan al mismo objeto.
		Equals() se usa para saber si dos objetos son del mismo tipo y tienen los mismos datos. 
		Nos dara el valor true si son iguales y false si no.
		Las subclases pueden sobreescribir el m�todo equals() parahacer una comparaci�n entre dos objetos.
		En la lista de argumentos del m�todo equals() hay que pasarle un argumento de tipo Object. 
		sino se sobrecarga el m�todo, no se sobreescribe.
	 *
	 *
	 *
	 */				
	
	
}
