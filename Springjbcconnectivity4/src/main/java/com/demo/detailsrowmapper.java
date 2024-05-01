package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class detailsrowmapper implements RowMapper<details> {

	@Override
	public details mapRow(ResultSet rs, int rowNum) throws SQLException {
		details d=new details();
		d.setId(rs.getInt("id"));
		d.setName(rs.getString("name"));
		d.setEmail(rs.getString("email"));
		return d;
	}
      
}
