/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huyttd.utils;

import java.io.Serializable;
import java.sql.Connection;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author KRIS
 */
public class DBConnection implements Serializable {

    public static Connection makeConnection() throws Exception {
        Context context = new InitialContext();
        System.out.println("Context: " + context);
        Context tomContext = (Context) context.lookup("java:comp/env");
        System.out.println("Tom Context: " + tomContext);
        DataSource ds = (DataSource) tomContext.lookup("SE140080");
        System.out.println("Datasource: " + ds);
        Connection conn = ds.getConnection();
        return conn;
    }
}
