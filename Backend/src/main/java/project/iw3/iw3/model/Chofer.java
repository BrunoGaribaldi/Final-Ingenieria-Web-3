package project.iw3.iw3.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "choferes")
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chofer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, unique = true, nullable = false)
    private String dni; //String supongo

    @Column(nullable = false,length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

}
