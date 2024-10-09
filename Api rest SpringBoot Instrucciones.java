Api rest SpringBoot Instrucciones

Crear proyecto con Springboot initiallizer. Agregar dependencias: SpringWeb, Spring Data JPA, MysqlDriver (o la que corresponda) 
y optativo Lombook

Abrir proyecto en Intellij. Modificar archivo main/esources/application.properties:

spring.application.name=    //NOMBRE DE PROYECTO
spring.datasource.url=jdbc:mysql://localhost:3306/crud
spring.datasource.username=root //O  NOMBRE DE USUARIO
spring.datasource.password=  //CONTRASEÑA DE MYSQL
spring.datasource.drive-class-name=com.mysql.jdbc.Driver
spring.jpa.show-sql:true
spring.jpa.hibernate.ddl-auto=create-drop //CREATE Y DESCARTE LA TABLA EN CADA TEST. iDEAL PARA DESARROLLO

Luego crear base de datos en Mysql (CREATE database nombredebase).

Crear Entity en el Paquete Java. Crear clase en Java/Entity:

Ej:

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Anotación para utilizar Lombook para setters y getters
@Entity
@Table // Anotación para crear tabla a partir de la entidad

public class Mascota {
    
    @Id //Anotación que indica que la entidad debe tener una Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // La Id será de generación automática
    
    private String nombre;
    private String sexo;
    private String color;
    private int tamaño;
    private boolean castracion;
    private int edad;

// Esta anotación se utiliza para especificar el mapeo del atributo a una columna en la base de datos.
    @Column(name = "email_address", unique = true)
    
    private String email;
}




public class Mascota {
    
    private String nombre;
    private String sexo;
    private String color;
    private int tamaño;
    private boolean castracion;
    private int edad;

    // Constructor
    public Mascota(String nombre, String sexo, String color, int tamaño, boolean castracion, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.tamaño = tamaño;
        this.castracion = castracion;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getColor() {
        return color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean isCastracion() {
        return castracion;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setCastracion(boolean castracion) {
        this.castracion = castracion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño=" + tamaño +
                ", castracion=" + castracion +
                ", edad=" + edad +
                '}';
    }
}

spring.application.name=seminario
spring.datasource.url=jdbc:mysql://localhost:3306/crud
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.drive-class-name=com.mysql.jdbc.Driver
spring.jpa.show-sql:true
spring.jpa.hibernate.ddl-auto=create-drop
