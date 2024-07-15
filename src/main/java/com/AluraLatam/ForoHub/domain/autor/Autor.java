package com.AluraLatam.ForoHub.domain.autor;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ValueGenerationType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String correo;
    private String contrasena;

    public Autor(DatosRegistroAutor datosRegistroAutor){
        this.nombre = datosRegistroAutor.nombre();
        this.correo = datosRegistroAutor.correo();
        this.contrasena = datosRegistroAutor.contrasena();

    }

    public void actualizarDatos(DatosActualizarAutor datosActualizarAutor) {
        if(datosActualizarAutor.nombre() != null){
            this.nombre = datosActualizarAutor.nombre();
        }
    }
}
