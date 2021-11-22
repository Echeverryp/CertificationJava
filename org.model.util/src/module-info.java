module org.model.util {
    requires transitive org.module.global;
    //en este caso con el to - el paquete solo va a ser leido por el amigo que especificamos despues del to
    // en este caso org.module.base es amigo de org.pkg.util
    exports org.pkg.util to org.module.base, org.module.concrete, org.module.global;
    //  exporta lo que tiene en el pkg.util para que el que lo requiera lo pueda usar  exports org.pkg.util;
    //transitive - todo el que requiera org.module.util va a poder acceder a org.module.global
}