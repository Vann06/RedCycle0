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
 *  Modela un tipo de clasificación de basura específico,
 *  permite mostrar información relevante al usuario para educarlo 
 *  respecto a las diferentes categorías que existen para clasificar los residuos.
 * */

public class Clasificacion {

        private String casificacion;
        private String descripcion;
        private String datoNegativo;
        private String datoPositivo;
    
        public Clasificacion(String casificacion, String descripcion, String datoNegativo, String datoPositivo) {
            this.casificacion = casificacion;
            this.descripcion = descripcion;
            this.datoNegativo = datoNegativo;
            this.datoPositivo = datoPositivo;
        }
    
        public Clasificacion() {
        }
    
        public void setCasificacion(String casificacion) {
            this.casificacion = casificacion;
        }
        
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public void setDatoNegativo(String datoNegativo) {
            this.datoNegativo = datoNegativo;
        }
    
        public void setDatoPositivo(String datoPositivo) {
            this.datoPositivo = datoPositivo;
        }
    
        public String getCasificacion() {
            return casificacion;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public String getDatoNegativo() {
            return datoNegativo;
        }
        
        public String getDatoPositivo() {
            return datoPositivo;
        }
    
        @Override
        public String toString() {
            return "Clasificacion [casificacion=" + casificacion + ", descripcion=" + descripcion + ", datoNegativo="
                    + datoNegativo + ", datoPositivo=" + datoPositivo + "]";
        }
    
    }
