package com.example.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refId;

	private String branchId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	private String createdUser;

	@Temporal(TemporalType.DATE)
	private Date dateStock;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;

	private String lastModifiedUser;

	private int quantity;

	//private int stockId;

	private BigDecimal version;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;

	//bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name="supplierId")
	private Supplier supplier;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	public Stock() {
	}

	public int getRefId() {
		return this.refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getDateStock() {
		return this.dateStock;
	}

	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
	}

	public Date getLastModifiedDateTime() {
		return this.lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(Date lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getLastModifiedUser() {
		return this.lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*public int getStockId() {
		return this.stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}*/

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}