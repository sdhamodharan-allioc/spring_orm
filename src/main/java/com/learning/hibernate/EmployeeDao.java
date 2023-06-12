package com.learning.hibernate;


import org.springframework.orm.hibernate5.HibernateTemplate;


public class EmployeeDao {
	
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void saveEmployee(Employee e) {
		template.save(e);
	}

	public void updateEmployee(Employee e) {
		template.update(e);
	}

	public void deleteEmployee(Employee e) {
		template.delete(e);
	}
}
