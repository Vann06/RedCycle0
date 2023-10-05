package Clases;

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
