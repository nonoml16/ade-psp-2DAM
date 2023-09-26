public class Direccion {

    private String nombreCalle, ciudad, provincia;
    private int codPostal;

    public Direccion(String nombreCalle, String ciudad, String provincia, int codPostal) {
        this.nombreCalle = nombreCalle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codPostal = codPostal;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }
}
