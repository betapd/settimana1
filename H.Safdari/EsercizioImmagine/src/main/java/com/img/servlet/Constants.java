package com.img.servlet;

public interface Constants {
	String SELECT_ALL_IMAGE = "Select id, urlimg, descrizione from img order by id"; //prepare statement
	String SELECT_IMAGE = "Select urlimg, descrizione from img where id = ?"; 
}