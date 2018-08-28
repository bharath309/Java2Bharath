package com.bellinfo.spring.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.bellinfo.spring.model.Itemdetail;
import com.bellinfo.spring.model.Links;
import com.bellinfo.spring.model.Products;
import com.bellinfo.spring.model.Register;

@Component
public class StudentRepository {
	Connection con = null;
	private static final String CREATE_TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS REGISTERATION_TABLE(firstname varchar(20),lastname varchar(20),email varchar(20)  UNIQUE,Password varchar(20))";
	private static final String INSERT_REGISTERATION_RECORD = "INSERT INTO REGISTERATION_TABLE VALUES(?,?,?,?)";
	private static final String VALIDATE_PASSWORD = "SELECT password FROM REGISTERATION_TABLE WHERE EMAIL=?";

	public DataSource datasource() {

		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("org.postgresql.Driver");
		datasource.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
		datasource.setUsername("postgres");
		datasource.setPassword("Srreddy95");
		return datasource;
	}

	private JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource());
		return jdbcTemplate;

	}

	public void persistStudentData(Register user) {
		JdbcTemplate template = jdbcTemplate();
		template.execute(CREATE_TABLE_STRUCTURE);
		template.update(INSERT_REGISTERATION_RECORD, user.getFirstname(), user.getLastname(), user.getEmail(),
				user.getPassword());

		System.out.println("inserted student data");

	}

	/*
	 * public Connection getConnection() { try {
	 * Class.forName("org.postgresql.Driver"); con = DriverManager.getConnection(
	 * "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "Srreddy95"); }
	 * catch (ClassNotFoundException e) { e.printStackTrace(); } catch (SQLException
	 * e) { e.printStackTrace(); } return con; }
	 */

	public boolean persistStudentvalidation(Register s2) {
		System.out.println("student validation in process");
		boolean password = validateStudent(s2);
		return password;

	}

	private boolean validateStudent(Register s2) {
		boolean password = false;
		JdbcTemplate template = jdbcTemplate();
		Register stud = new Register("", "");
		try {
			stud = template.queryForObject(VALIDATE_PASSWORD, new Object[] { s2.getEmail() },
					new RowMapper<Register>() {

						public Register mapRow(ResultSet arg0, int arg1) throws SQLException {
							Register stud = new Register("", "");
							stud.setPassword(arg0.getString(1));
							System.out.println(stud.toString());
							return stud;
						}
					});
			if (stud.getPassword().equals(s2.getPassword())) {
				password = true;
			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(password + stud.getPassword());
		return password;
	}

	public Links fetchRelatedLinks(String name) {

		List<String> list = fetchRelatedLinks1(name);
		Links l1 = new Links();
		l1.setLink1(list.get(0));
		l1.setLink2(list.get(1));
		l1.setLink3(list.get(2));
		l1.setLink4(list.get(3));
		l1.setLink5(list.get(4));
		l1.setLink6(list.get(5));
		return l1;
	}

	public List<String> fetchRelatedLinks1(String name) {
		String query1 = "select image_url from products where product_type= ";
		String query = query1 + name;
		System.out.println(query);
		JdbcTemplate template = jdbcTemplate();

		List<String> data = template.query(query, new RowMapper<String>() {
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});

		// System.out.println(data);

		return data;

	}

	public Products fetchItemRecord(String itemid)  {
		JdbcTemplate template = jdbcTemplate();
		String query1 = "select * from products where product_name= ";
		String query = query1 + itemid;
		System.out.println(query);
		
		Products product = template.queryForObject(query,
				new RowMapper<Products>() {

					public Products mapRow(ResultSet arg0, int arg1) throws SQLException {
						Products prod=new Products();
						prod.setProduct_type(arg0.getString(2));
						prod.setDescription(arg0.getString(4));
						prod.setImage_url(arg0.getString(5));
						prod.setPrice(arg0.getFloat(6));
						System.out.println(prod.toString());
						return prod;
					}
				});
		System.out.println(product);
		return product;
		
	


	}

	
}
