package com.camotechq.onlineshoppingbackend;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.camotechq.onlineshoppingbackend.model.Category;
import com.camotechq.onlineshoppingbackend.repository.CategoryRepository;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryRepository categoryRepository;
	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.camotechq.onlineshoppingbackend");
		context.refresh();
		categoryRepository = (CategoryRepository) context.getBean("categoryRepository");
	}

	/*@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Television");
		category.setDescription("Fake Television");
		category.setImageURL("television.png");

		assertEquals("Successfully added a category inside the table", true, categoryRepository.add(category));
	}*/

	/*@Test
	public void testGetCategorybyId() {
		category = categoryRepository.get(1);
		assertEquals("Successfully fetched a single category from table", "Television", category.getName());
	}*/

	/*@Test
	public void testUpdateCategory() {
		category = categoryRepository.get(1);
		category.setName("TV");
		assertEquals("Successfully updated a single category from table", true, categoryRepository.update(category));
	}*/

	/*@Test
	public void testDeleteCategoy() {
		category = categoryRepository.get(1);
		assertEquals("Successfully deleted a single category from table", true, categoryRepository.delete(category));
	}*/

	/*@Test
	public void testCategoryList() {
		assertEquals("Successfully fetch 1 active category in table", 1, categoryRepository.list().size());
	}*/
}
