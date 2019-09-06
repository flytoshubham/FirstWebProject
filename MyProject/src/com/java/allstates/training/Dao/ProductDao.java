package com.java.allstates.training.Dao;

import java.util.List;

import com.allstate.training.pojo.Product;

public interface ProductDao {

	public int addProduct(Product p);
	public int updateQty(int pid,int qty);
	public int updateCost(int pid,int cost);
	public int deleteProduct(int pid);
	public Product getProductById(int pid);
	public List<Product> getProducts();
}
