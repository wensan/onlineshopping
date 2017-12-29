package com.camotechq.onlineshoppingbackend.repository;

import java.util.List;

import com.camotechq.onlineshoppingbackend.model.Category;

public interface CategoryRepository {
	List<Category> list();
	Category get(int id);
}
