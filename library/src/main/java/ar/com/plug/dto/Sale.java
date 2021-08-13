package ar.com.plug.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Product product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Customer customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "seller")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Seller seller;

    @Column(name="sale_price")
    private Double salePrice;

    @Column(name="quantity")
    private Integer quantity;

    @Column(name="total")
    private Double total;

    @Column(name="tax")
    private Double tax;

    @Column(name="status")
    private Integer idStatus;

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", Customer='" + customer + '\'' +
                ", Product='" + product + '\'' +
                ", Seller='" + seller + '\'' +
                ", quantity='" + quantity + '\'' +
                ", salePrice='" + salePrice + '\'' +
                ", tax='" + tax + '\'' +
                ", total='" + total + '\'' +
                ", idStatus='" + idStatus + '\'' +
                '}';
    }
}
