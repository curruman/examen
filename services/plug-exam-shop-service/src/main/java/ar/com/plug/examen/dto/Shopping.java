package ar.com.plug.examen.dto;


import ar.com.plug.dto.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="shopping")
public class Shopping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_operation_shop")
    private Integer id;

    @NotNull(message="id product cannot be null")
    @ManyToOne(optional = false)
    @JoinColumn(name = "product")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Product product;

    @Column(name="date")
    private LocalDate date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "supplier")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Supplier supplier;

    @Column(name="id_status")
    private Integer idStatus;


    @Override
    public String toString() {
        return "Shopping{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", date='" + date + '\'' +
                ", supplier='" + supplier + '\'' +
                ", idStatus='" + idStatus + '\'' +
                '}';
    }
}
