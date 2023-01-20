
public class main {

	public static void main(String[] args) {
		
		cuadrado c = new cuadrado(); 
		System.out.println("El lado inicial del cuadrado es: "+c.id);
		System.out.println("El perimetro es: "+c.perimetro);
		System.out.println("El area es: "+c.area);
		System.out.println("La diagonal es: "+c.diagonal);
		
		c.nuevovalor=10;
		
		System.out.println("el nuevo valor es: "+c.nuevovalor);

	}

}
