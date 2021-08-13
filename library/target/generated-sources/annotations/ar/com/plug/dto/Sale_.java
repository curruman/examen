package ar.com.plug.dto;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sale.class)
public abstract class Sale_ {

	public static volatile SingularAttribute<Sale, Seller> seller;
	public static volatile SingularAttribute<Sale, Integer> idStatus;
	public static volatile SingularAttribute<Sale, Product> product;
	public static volatile SingularAttribute<Sale, Double> total;
	public static volatile SingularAttribute<Sale, Integer> quantity;
	public static volatile SingularAttribute<Sale, Double> salePrice;
	public static volatile SingularAttribute<Sale, Double> tax;
	public static volatile SingularAttribute<Sale, Integer> id;
	public static volatile SingularAttribute<Sale, Customer> customer;

	public static final String SELLER = "seller";
	public static final String ID_STATUS = "idStatus";
	public static final String PRODUCT = "product";
	public static final String TOTAL = "total";
	public static final String QUANTITY = "quantity";
	public static final String SALE_PRICE = "salePrice";
	public static final String TAX = "tax";
	public static final String ID = "id";
	public static final String CUSTOMER = "customer";

}

