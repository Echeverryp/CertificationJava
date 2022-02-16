package secondTime.collector.dto;

public class Empresa {
    private Integer idEmpresa;
    private String nombre;
    private String correo;
    private String direccion;
    private int numeroEmpleados;

    public Empresa(Integer idEmpresa, String nombre, String correo, String direccion, int numeroEmpleados) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
}
