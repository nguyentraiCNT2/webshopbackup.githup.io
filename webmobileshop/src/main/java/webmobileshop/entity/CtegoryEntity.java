package webmobileshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Category")
@Data
public class CtegoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
	private Long CategoryId;
    @Column(name = "CategoryName",columnDefinition = "NVARCHAR(MAX)")
	private String CategoryName;
	public Long getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Long categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
}
