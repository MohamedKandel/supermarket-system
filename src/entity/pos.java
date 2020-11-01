/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import supermarket.Tools;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Mohamed
 */
public class pos {

    private double Price;
    private int qty;
    private String Barcode;
    private String Name;

    public String getName(String bar) {
        //String sql = "select ProName from product where Barcode = '" + bar + "'";
        String sql = "select ProName from product where Barcode = '" + bar + "'";
        String str = (String) db.database.getTableData(sql).items[0][0];
        return str;
    }

    public String getPrice(String bar) {
        String sql = "select Price from product where Barcode = '" + bar + "'";
        String str = (String) db.database.getTableData(sql).items[0][0];
        return str;
    }

    public String getqty(String bar) {
        String sql = "select Qty from product where Barcode = '" + bar + "'";
        String str = (String) db.database.getTableData(sql).items[0][0];
        //String msg = "Available quantity for this product in stock = " + str;
        //JOptionPane.showMessageDialog(null, msg);
        return str;
    }

    public String getID() {
        String sql = "select max(ID) from sales";
        String str = (String) db.database.getTableData(sql).items[0][0];
        //String msg = "Available quantity for this product in stock = " + str;
        //JOptionPane.showMessageDialog(null, msg);
        return str;
    }
    ResultSet rs;
    Connection con;
    Statement st;

    public void setqty(String bar) {
        boolean check;
        String sql = "Select SUM(QTY) FROM sales_product where Prod_ID = '" + bar + "'";
        String str = (String) db.database.getTableData(sql).items[0][0];
        String update = "update product set Qty = Qty - " + str
                + " where Barcode = '" + bar + "'";

        check = db.database.RunNonQuery(update);
        if (check) {
            Tools.msg("Success");
        } else {
            Tools.msg("Failed");
        }
    }

    public String getUser(String user) {
        String select = "select username from users where username = '" + user + "'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }
}
