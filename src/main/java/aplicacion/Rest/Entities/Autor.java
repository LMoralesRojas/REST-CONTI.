package aplicacion.Rest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Audited
@EqualsAndHashCode(callSuper = true)
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia", length = 1500)
    private String biografia;

}


