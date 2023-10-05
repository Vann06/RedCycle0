package Clases;

/*
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 19/09/2023
 * Fecha final: 19/09/2023
 *
 * @author Nadissa Lopez 23764
 * @author Vianka Castro 23201
 * @author Ricardo Godinez 23247
 * 
 * Clase controladora que conecta todos los modelos del
 * programa, es crucial porque concentra la lógica primordial del sistema.
 * 
 * */
import java.util.ArrayList;

public class Driver {

	//Atributos
	private Usuario usuario;
	private ArrayList<Clasificacion> clasificacionesBasura;
	

	//Metodos
	
	
	//Getters y Setters
	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public ArrayList<Clasificacion> getClasificacionesBasura() {
		return clasificacionesBasura;
	}



	public void setClasificacionesBasura(ArrayList<Clasificacion> clasificacionesBasura) {
		this.clasificacionesBasura = clasificacionesBasura;
	}
	
	

	public Driver(Usuario usuario, ArrayList<Clasificacion> clasificacionesBasura) {
		super();
		this.usuario = usuario;
		this.clasificacionesBasura = clasificacionesBasura;
	}
	
	
	/**
	 * 
	 * @param nombre
	 * @param correo
	 * @param password
	 * @param contenedoresBasura
	 */
	public void guardarUsuario(String nombre, String correo, String password, Contenedor contenedoresBasura){
		
		
	}
	
	
	
	
	
	
	

	
}
