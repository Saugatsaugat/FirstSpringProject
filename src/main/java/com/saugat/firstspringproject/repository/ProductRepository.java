package com.saugat.firstspringproject.repository;

import com.saugat.firstspringproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
