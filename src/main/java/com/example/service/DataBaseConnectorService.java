package com.example.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBaseConnectorService {

    
    private final DataSource dataSource;
    /**
     * Constructor to inject the DataSource dependency.
     *
     * @param dataSource the DataSource to be used for database connections
     */

    @Autowired
    public DataBaseConnectorService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }
}
