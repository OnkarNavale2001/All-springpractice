package com.in;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StuentRowmaper implements RowMapper<Student>  {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	    Student st=new Student();
	    st.setId(rs.getInt("id"));
	    st.setEmail(rs.getString("name"));
	    
	    st.setName(rs.getString("email"));
		return st;
	}

}
