package com.example.karabourse.models;

import android.widget.SearchView;

public class ProductModel {
	int id;
	int img;
	String title;
	String limit_of_course;
	float price;
	float rate;
	Boolean bookmark;

	public ProductModel( int img, String title, String limit_of_course, float price, float rate) {
		this.img = img;
		this.title = title;
		this.limit_of_course = limit_of_course;
		this.price = price;
		this.rate = rate;
	}

	public ProductModel(String title, String limit_of_course) {
		this.title = title;
		this.limit_of_course = limit_of_course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLimit_of_course() {
		return limit_of_course;
	}

	public void setLimit_of_course(String limit_of_course) {
		this.limit_of_course = limit_of_course;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Boolean getBookmark() {
		return bookmark;
	}

	public void setBookmark(Boolean bookmark) {
		this.bookmark = bookmark;
	}
}
