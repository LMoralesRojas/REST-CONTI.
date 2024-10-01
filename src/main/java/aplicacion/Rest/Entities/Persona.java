package aplicacion.Rest.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Audited
@EqualsAndHashCode(callSuper = true)

public class Persona extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade =CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "Persona-libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();

}
