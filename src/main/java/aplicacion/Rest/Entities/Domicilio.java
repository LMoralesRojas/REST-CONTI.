package aplicacion.Rest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Audited
@EqualsAndHashCode(callSuper = true)
public class Domicilio extends Base {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)//para que no ingresen valores nulos
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}



