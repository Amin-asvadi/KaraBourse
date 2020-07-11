package com.example.karabourse.ui.home.model;

public class LiveScreenStockModel {
	private String bourseSymbol;
	private float closingPChgPercent;
	private float openingPrice;
	private float closingPrice;

	public LiveScreenStockModel(String bourseSymbol, float closingPChgPercent, float openingPrice, float closingPrice) {
		this.bourseSymbol = bourseSymbol;
		this.closingPChgPercent = closingPChgPercent;
		this.openingPrice = openingPrice;
		this.closingPrice = closingPrice;
	}

	public String getBourseSymbol() {
		return bourseSymbol;
	}

	public void setBourseSymbol(String bourseSymbol) {
		this.bourseSymbol = bourseSymbol;
	}

	public float getClosingPChgPercent() {
		return closingPChgPercent;
	}

	public void setClosingPChgPercent(float closingPChgPercent) {
		this.closingPChgPercent = closingPChgPercent;
	}

	public float getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(float openingPrice) {
		this.openingPrice = openingPrice;
	}

	public float getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(float closingPrice) {
		this.closingPrice = closingPrice;
	}
}
