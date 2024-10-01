package aplicacion.Rest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Audited
@EqualsAndHashCode(callSuper = true)
public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "autor")
    private String autor;

    @ManyToMany(cascade = CascadeType.REFRESH)//sirve por si se requiere actualizar
    private List<Autor> autores;
}
