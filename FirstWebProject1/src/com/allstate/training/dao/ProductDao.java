package com.allstate.training.dao;


import com.allstate.training.pojos.Product;

import java.util.List;


public interface ProductDao {

	public int addProduct(Product p);
	public int updateQty(int pid,int qty);
	public int updateCost(int pid,int cost);
	public int deleteProduct(int pid);
	public Product getProductById(int pid);
	public List<Product> getProducts();
	public int updateProduct(Product p);
}
