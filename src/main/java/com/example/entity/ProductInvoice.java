package com.example.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the product_invoice database table.
 * 
 */
@Entity
@Table(name="product_invoice")
@NamedQuery(name="ProductInvoice.findAll", query="SELECT p FROM ProductInvoice p")
public class ProductInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refId;

	//bi-directional many-to-one association to Invoice
	@ManyToOne
	private Invoice invoice;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	public ProductInvoice() {
	}

	public int getRefId() {
		return this.refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public Invoice getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}