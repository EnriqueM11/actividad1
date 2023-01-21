
public class cuadrado {
	public int id;
	public int perimetro;
	public int area;
	public int diagonal;
	public int nvalor;
	public int nperimetro;
	public int narea;
	public int ndiagonal;
	
	public cuadrado() {
		this.id=id;
		this.perimetro= perimetro;
		this.area=area;
		this.diagonal=diagonal;
		this.nvalor=nvalor;
		this.narea=narea;
		this.nperimetro=nperimetro;
		this.ndiagonal=ndiagonal;
		
		id=174798;
		perimetro=id*4;
		area=id*2;
		diagonal=(int)Math.sqrt(Math.pow(id, 2)+Math.pow(id, 2));
		nvalor=10;
		nperimetro=nvalor*4;
		narea=nvalor*2;
		ndiagonal=(int)Math.sqrt(Math.pow(nvalor, 2)+Math.pow(nvalor, 2));
		
	}

}

