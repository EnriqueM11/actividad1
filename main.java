
public class main {

	public static void main(String[] args) {
		
		cuadrado c = new cuadrado(); 
		System.out.println("El lado inicial del cuadrado es: "+c.id);
		System.out.println("El perimetro es: "+c.perimetro);
		System.out.println("El area es: "+c.area);
		System.out.println("La diagonal es: "+c.diagonal);
		
		c.nuevovalor=10;
		
		System.out.println("el nuevo valor es: "+c.nuevovalor);
		
		circulo cir = new circulo();
		
		System.out.println("El lado inicial del circulo es: "+cir.id);
		System.out.println("La circunferencia es: "+cir.circunferencia);
		System.out.println("El area del circulo es: "+cir.area);
		cir.nuevovalor=(float) 5.26;
		System.out.println("El nuevo valor es: "+cir.nuevovalor);
		
		

	}

}
