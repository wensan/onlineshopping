package com.camotechq.onlineshoppingbackend.repository;

import java.util.List;

import com.camotechq.onlineshoppingbackend.model.Category;

public interface CategoryRepository {
	boolean add(Category category);
	List<Category> list();
	Category get(int id);
	boolean update(Category category);
	boolean delete(Category category);
}
