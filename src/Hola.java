
public class Hola {
	private String saludo;
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public static void main(String[] args) {
		Hola hola = new Hola();
		hola.setSaludo("Prueba");
		System.out.println(hola.getSaludo());
		
		System.out.println("Hola mundo 2");
		System.out.println("Hola mundo 3");
		System.out.println("Hola mundo 4");
	
		System.out.println("Nueva funcionalidad rama Dev");
		System.out.println("Modificacion A");
		System.out.println("Modificacion B");
	}

}