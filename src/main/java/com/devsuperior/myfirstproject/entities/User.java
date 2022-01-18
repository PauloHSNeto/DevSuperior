package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Short age;
	private Boolean is_avaliable;	
	
	@ManyToOne
	@JoinColumn(name = "category_name")
	private Category category;

	public User() {
	}	
	public User(Long id, String name, Short age, Boolean is_avaliable, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.is_avaliable = is_avaliable;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getage() {
		return age;
	}

	public void setage(Short age) {
		this.age = age;
	}

	public Boolean getIs_avaliable() {
		return is_avaliable;
	}

	public void setIs_avaliable(Boolean is_avaliable) {
		this.is_avaliable = is_avaliable;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}