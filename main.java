public class main {

	public static void main(String[] args) {
		
		cuadrado c = new cuadrado();
		
		System.out.println("El lado inicial del cuadrado es: "+c.id);
		System.out.println("El perimetro es: "+c.perimetro);
		System.out.println("El area es: "+c.area);
		System.out.println("La diagonal es: "+c.diagonal);
		
		System.out.println("el nuevo valor es: "+c.nvalor);
		System.out.println("El perimetro con el nuevo valor es: "+c.nperimetro);
		System.out.println("El area con el nuevo valor es: "+c.narea);
		System.out.println("La diagonal con el nuevo valor es: "+c.ndiagonal);
		
		circulo cir = new circulo();
		
		System.out.println("El lado inicial del circulo es: "+cir.id);
		System.out.println("La circunferencia es: "+cir.circunferencia);
		System.out.println("El area del circulo es: "+cir.area);
		System.out.println("El nuevo valor es: "+cir.nuevovalor);
		System.out.println("La cirncuferencia con el nuevo valor es: "+cir.ncircunferencia);
		System.out.println("El area con el nuevo valor es: "+cir.narea);
		
		

	}

}
