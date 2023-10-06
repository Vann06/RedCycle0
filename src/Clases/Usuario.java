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
 * Esta es clase es para guardar toda la 
 * informacion de un Usuario
 * 
 * 
 * */

import java.util.ArrayList;


public class Usuario {
	
	
	//Atributos 
	private String nombre= "";
	private String correo= "";
	private String password = "";
	private ArrayList<Contenedor> contedenoresBasura;

	
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", contedenoresBasura="
				+ contedenoresBasura + "]";
	}

	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Contenedor> getContedenoresBasura() {
		return contedenoresBasura;
	}
	public void setContedenoresBasura(ArrayList<Contenedor> contedenoresBasura) {
		this.contedenoresBasura = contedenoresBasura;
	}

	
	//Constructor
	public Usuario(String nombre, String correo, String password, ArrayList<Contenedor> contedenoresBasura) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.contedenoresBasura = contedenoresBasura;
	}
	
	
}
