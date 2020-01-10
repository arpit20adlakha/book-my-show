package com.bms.model;

public class Cinema {

	private Integer cinemaId;
	private Layout layout;    

     
	public Cinema(Integer cinemaId, int rows, int columns){
		this.cinemaId = cinemaId;
		this.layout = new Layout(rows,columns);
	}


	public Integer getCinemaId() {
		return cinemaId;
	}


	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}


	public Layout getLayout() {
		return layout;
	}


	public void setLayout(Layout layout) {
		this.layout = layout;
	}
	
	
}
