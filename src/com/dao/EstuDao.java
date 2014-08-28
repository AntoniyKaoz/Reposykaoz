package com.dao;

import java.util.List;

import javax.sql.DataSource;

import com.modelo.Estudiante;

public interface EstuDao {

	public void setDataSource(DataSource dataSour);
	public void saveEstudiante(Estudiante estudiante);
	public List<Estudiante> getEstudiantes();
	
}
