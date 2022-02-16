package secondTime.collector.dto;

import java.util.Date;

public class Empleado {
    private Integer idEmpleado;
    private String nombre;
    private Integer edad;
    private String direccion;
    private String correo;
    private double salario;
    private Date fechaIngreso;
    private Date fechaRetiro;
    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado(Integer idEmpleado, String nombre, Integer edad, String direccion, String correo, double salario, Date fechaIngreso, Date fechaRetiro,
                    Empresa empresa) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.correo = correo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.empresa=empresa;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", salario=" + salario +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaRetiro=" + fechaRetiro +
                ", empresa=" + empresa +
                '}';
    }
}
