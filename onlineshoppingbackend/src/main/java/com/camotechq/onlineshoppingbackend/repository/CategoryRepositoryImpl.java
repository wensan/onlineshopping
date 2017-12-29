package com.camotechq.onlineshoppingbackend.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.camotechq.onlineshoppingbackend.model.Category;

@Repository("categoryRepository")
public class CategoryRepositoryImpl implements CategoryRepository {
	private static List<Category> categories = new ArrayList<Category>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("Fake Television");
		category.setImageURL("television.png");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("DVD");
		category.setDescription("Fake DVD");
		category.setImageURL("dvd.png");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Air Condition");
		category.setDescription("Fake Air Condition");
		category.setImageURL("aircon.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}
}
