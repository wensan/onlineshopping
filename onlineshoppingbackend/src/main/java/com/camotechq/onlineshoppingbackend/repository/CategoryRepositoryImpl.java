package com.camotechq.onlineshoppingbackend.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.camotechq.onlineshoppingbackend.model.Category;

@Repository("categoryRepository")
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	@SuppressWarnings("unchecked")
	public List<Category> list() {
		String sql = "FROM Category WHERE active = :active";
		Query query = em.createQuery(sql);
		query.setParameter("active", true);

		return query.getResultList();
	}

	@Override
	public Category get(int id) {
		return em.find(Category.class, Integer.valueOf(id));
	}

	@Override
	@Transactional
	public boolean add(Category category) {
		try {
			em.persist(category);
			em.flush();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		try {
			em.merge(category);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			em.merge(category);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
