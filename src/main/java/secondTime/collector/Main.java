package secondTime.collector;

import secondTime.collector.dto.Empleado;
import secondTime.collector.dto.Empresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Empresa dreamcode=new Empresa(1,"Dreamcode","dreamcodesoft@dreamcodesoft.com","Carrera 16#2-110",120);
    static Empresa bolivar=new Empresa(2,"Seguros Bolivar","segurosbolivar@bolivar.com","Carrera 11#2-2",1100);

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static List<Empleado> empleados;

    static {
        try {
            empleados = List.of(new Empleado
                    (1,"Pablo",27,"Carrera 25 #2-130","pablo.echeverry@dreamcodesoft.com",
                            5750000,sdf.parse("01/03/2019"),null, dreamcode),
                    new Empleado
                            (1,"Juan",27,"Carrera 44A #2-50","juan.riascos@dreamcodesoft.com",
                                    4500000,sdf.parse("01/12/2021"),null,dreamcode),
                    new Empleado
                            (2,"Hector",26,"Cra 2 #44N-1","hector.ocampo@dreamcodesoft.com",
                                    3500000,sdf.parse("01/07/2021"),new Date(2021,12,1),bolivar),
                    new Empleado
                            (3,"Jonatan",27,"Carrera 39 #101-1","jonatan.echeverry@dreamcodesoft.com",
                                    5200000,sdf.parse("01/03/2019"),null,bolivar),
                    new Empleado
                            (2,"Roberth",31,"Carrera 1#2N-12","roberth.martinez@dreamcodesoft.com",
                                    5500000,sdf.parse("05/12/2019"),null,bolivar),
                    new Empleado
                            (3,"Michael",35,"Carrera 50#2N-11","michael.muñoz@dreamcodesoft.com",
                                    5200000,sdf.parse("05/03/2020"),null,dreamcode),
                    new Empleado
                            (1,"Ana",29,"Carrera 33#2N-12","ana.choconta@dreamcodesoft.com",
                                    5000000,sdf.parse("11/10/2019"),null,dreamcode)




            );
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(" ** Todos Los Empleados **");
        obtenerTodosLosEmpleados();
        System.out.println("**************************");

        System.out.println(" ** Empleados Por Año **");
        obtenerEmpleadosPorAnio(1);
        System.out.println("**************************");

        System.out.println(" ** Empleados Agrupados Por Id **");
        collectorGroupByName();
        System.out.println("**************************");
    }

    public static void obtenerTodosLosEmpleados(){
        empleados.stream().forEach(System.out::println);
    }

    public static void obtenerEmpleadosPorAnio(int num){

        empleados.stream().filter(emp->{

            LocalDate now=new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate empDate=emp.getFechaIngreso().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if((now.getYear()-empDate.getYear())>=num){
                return true;
            }
            else {
                return false;
            }
        }).forEach(System.out::println);
    }

    public static void collectorsToList(int num){

        List<Empleado> empleadosCollect=empleados.stream().collect(Collectors.toList());
    }

    public static void collectorGroupByName(){


        empleados.stream().collect(Collectors.groupingBy(Empleado::getIdEmpleado,LinkedHashMap::new,Collectors.counting())).entrySet().stream().forEach(System.out::println);
        System.out.println("****");
        empleados.stream().collect(Collectors.groupingBy(Empleado::getIdEmpleado,Collectors.counting())).entrySet().stream().forEach(System.out::println);;
    }
}
