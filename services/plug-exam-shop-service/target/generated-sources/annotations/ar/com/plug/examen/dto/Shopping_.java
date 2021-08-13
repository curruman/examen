package ar.com.plug.examen.dto;

import ar.com.plug.dto.Product;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Shopping.class)
public abstract class Shopping_ {

	public static volatile SingularAttribute<Shopping, LocalDate> date;
	public static volatile SingularAttribute<Shopping, Integer> idStatus;
	public static volatile SingularAttribute<Shopping, Product> product;
	public static volatile SingularAttribute<Shopping, Supplier> supplier;
	public static volatile SingularAttribute<Shopping, Integer> id;

	public static final String DATE = "date";
	public static final String ID_STATUS = "idStatus";
	public static final String PRODUCT = "product";
	public static final String SUPPLIER = "supplier";
	public static final String ID = "id";

}

