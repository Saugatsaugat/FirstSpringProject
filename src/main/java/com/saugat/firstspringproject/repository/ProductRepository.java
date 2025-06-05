package com.saugat.firstspringproject.repository;

import com.saugat.firstspringproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Product p){
        String sql = "Insert into Product (id, name, groupName) values (?,?,?)";
        int rows = template.update(sql, p.getId(), p.getName(), p.getGroupName());
        System.out.println(rows + " affected");
    }

    public List<Product> findAll(){
        String sql = "Select * from Product";
        RowMapper<Product> rowMapper = new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setGroupName(rs.getString("groupName"));
                return p;
            }
        };
        return template.query(sql, rowMapper);
    }
}
