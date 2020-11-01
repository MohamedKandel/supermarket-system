/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.swing.JTable;
import supermarket.Tools;

/**
 *
 * @author Mohamed
 */
public class Category implements maindata{
    private int ID;
    private String Name;
    private String Status;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
        public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public void add() {
        String insert = "insert into category values ("+ID+ " , '"+Name+"' , '"+Status+"')";
        db.database.RunNonQuery(insert);
    }

    @Override
    public void update() {
        String update = "update category set Category = '"+Name+"' "
                +", Statuss = '"+Status+"' "
                +"where ID = " + ID;
        db.database.RunNonQuery(update);
    }

    @Override
    public void delete() {
        String delete = "delete from category where ID = " + ID;
        db.database.RunNonQuery(delete);
    }

    @Override
    public String getAutoNumber() {
        String AutoNum = db.database.getAutoNumber("category" , "ID");
        return AutoNum;
   }

    @Override
    public void selectAll(JTable table) {
        db.database.fillToJTable("category", table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select * from category where "
                + "ID = " + ID;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String select = "select ID from category where "
                + "Category = '" +name+"'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }

    @Override
    public String getNameByValue(String value) {
        String select = "select Category from category where "
                + "ID = " +value;
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }
}
