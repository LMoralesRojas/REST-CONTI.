package aplicacion.Rest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.io.Serializable;
@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Audited
@EqualsAndHashCode(callSuper = true)
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

}
