module app.boot {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires servicio;
    requires modelo;

    opens com.fe.dev.isa.app to spring.core, spring.beans, spring.context;
}