package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class DatabaseConnectionTest {
    private DatabaseConnection db;
    private String connectionString;

    @BeforeEach
    void setup() {
        connectionString = "Server=myServerAddress;Database=myDataBase;User Id=myUsername;Password=myPassword;";
        Assertions.assertTrue(db.connect(connectionString));
    }

    @AfterEach
    void ShouldConnectCoreclty() {
        Assertions.assertTrue(db.disconect(connectionString));
    }
}
