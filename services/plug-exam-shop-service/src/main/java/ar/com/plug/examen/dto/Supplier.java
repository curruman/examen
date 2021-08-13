package ar.com.plug.examen.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_supplier")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="id_status")
    private Integer id_status;

    @Override
    public String toString() {
        return "Supplier{" +
                "id_supplier=" + id +
                ", name='" + name + '\'' +
                ", status='" + id_status + '\'' +
                '}';
    }
}
