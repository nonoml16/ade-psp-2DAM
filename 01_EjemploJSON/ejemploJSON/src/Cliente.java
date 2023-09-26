public class Cliente {

    private String firstName, lastName;
    private Direccion direccion;

    public Cliente(String firstName, String lastName, Direccion direccion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.direccion = direccion;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
