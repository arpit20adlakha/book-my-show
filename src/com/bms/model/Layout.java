package com.bms.model;

import com.bms.exception.BookClashException;

public class Layout {
	boolean[][] seatGrid;
	Layout(int col, int row)
	{
		this.seatGrid = new boolean[row][col];
	}
	
	public boolean book(int col, int row) throws BookClashException{
		if(seatGrid[row][col])
			throw new BookClashException();
		seatGrid[row][col] = true;
		return true;
	}
	public boolean isEmpty(int col, int row) {
		return seatGrid[row][col]==false;
	}
}
