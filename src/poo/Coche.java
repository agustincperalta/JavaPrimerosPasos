package poo;

public class Coche {
	
	// Propiedades Encapsuladas
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientosCuero, climatizador;
	
	// Método constructor --> estado inicial
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
	}
	
	// Método Getter
	public String dimeDatos() {
		return "La plataforma del coche tiene "
				+ ruedas + " ruedas " + ".Mide " +
				largo / 1000 + " metros con un ancho de "
				+ ancho + " cm y un peso de plataforma "
				+ peso_plataforma + " kg.";
	}
	
	// Método Setter con paso de parametros
	public void establece_color(String color_coche) {
		color = color_coche;
	}
	// Metodo Getter
	public String dimeColor() {
		return "El color del coche es " + color;
	}
	
	// Metodo Setter
	public void configuraAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}else {
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos() {
		if(asientosCuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	// Setter
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}
	// Getter
	
	public String dime_climatizador() {
		if(climatizador == true) {
			return "El coche incorpora aclimatizador";
			
		}else {
			return "El coche incorpora aire acondicionado";
		}
	}
	
	// Esto no se hace --> combinar setter y getter
	public String dime_peso_coche() {
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientosCuero) {
			peso_total += 50;
		}
		if(climatizador) {
			peso_total += 20;
		}
		return "El peso del coche es " + peso_total;
	}
	
	public int precioCoche() {
		int precio_final = 10000;
		
		if(asientosCuero) {
			precio_final += 2000;
		}
		if(climatizador) {
			precio_final += 1500;
		}
		
		return precio_final;
	}
}
 	