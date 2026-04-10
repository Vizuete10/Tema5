package ejercicio1Analisis;

public abstract class Vehiculo {

	protected String marca;
	protected String modelo;
	protected String color;
	protected String matricula;
	protected boolean motorEncendido;
	protected int marchaActual;
	protected int velocidadActual;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.motorEncendido = false;
		this.marchaActual = 0;
		this.velocidadActual = 0;
	}

	// Métodos de conducción

	public void arrancar() {
		if (!motorEncendido) {
			motorEncendido = true;
			System.out.println(marca + " " + modelo + ": motor arrancado.");
		} else {
			System.out.println("El motor ya estaba encendido.");
		}
	}

	public void parar() {
		velocidadActual = 0;
		marchaActual = 0;
		motorEncendido = false;
		System.out.println(marca + " " + modelo + ": vehículo parado, motor apagado.");
	}

	public void subirMarcha() {
		if (marchaActual < 5) {
			marchaActual++;
			System.out.println("Subida a " + marchaActual + "ª marcha.");
		} else {
			System.out.println("Ya estás en 5ª marcha.");
		}
	}

	public void bajarMarcha() {
		if (marchaActual > 0) {
			marchaActual--;
			System.out.println("Bajada a " + (marchaActual == 0 ? "punto muerto" : marchaActual + "ª marcha") + ".");
		} else {
			System.out.println("Ya estás en punto muerto.");
		}
	}

	public void acelerar(int incremento) {
		if (!motorEncendido) {
			System.out.println("El motor está apagado. Arranca primero.");
			return;
		}
		velocidadActual += incremento;
		marchaActual = getMarchaSegunVelocidad();
		System.out.println("Velocidad: " + velocidadActual + " km/h | Marcha: " + marchaActual + "ª");
	}

	public void desacelerar(int decremento) {
		velocidadActual = Math.max(0, velocidadActual - decremento);
		marchaActual = getMarchaSegunVelocidad();
		System.out.println("Velocidad: " + velocidadActual + " km/h | Marcha: "
				+ (marchaActual == 0 ? "punto muerto" : marchaActual + "ª"));
	}

	private int getMarchaSegunVelocidad() {
		if (velocidadActual < 30)
			return 1;
		if (velocidadActual < 50)
			return 2;
		if (velocidadActual < 70)
			return 3;
		if (velocidadActual < 100)
			return 4;
		return 5;
	}

	// Getters 

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	// equals 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo otro = (Vehiculo) obj;
		return this.matricula.equals(otro.matricula);
	}

	@Override
	public abstract String toString();
}
