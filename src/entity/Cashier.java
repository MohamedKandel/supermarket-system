package entity;

import javax.swing.JTable;

public class Cashier implements maindata{
    private int ID;
    private String Name;
    private String pass;
    private String status;
    
    private boolean check;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void add() {
        String insert = "insert into users values ("+ID
                +" , '"+Name+"' , "
                +"'"+pass+"' , "
                +"'"+status+"' )";
        check = db.database.RunNonQuery(insert);
    }

    @Override
    public void update() {
        String insert = "update users set Username = '"+Name
                +"' , Statuss = '"+status+"' "
                +"where ID = "+ ID;
        check = db.database.RunNonQuery(insert);
    }

    @Override
    public void delete() {
        String insert = "delete from users where ID = "+ ID;
        check = db.database.RunNonQuery(insert);
    }

    @Override
    public String getAutoNumber() {
        String auto = db.database.getAutoNumber("users", "ID");
        return auto;
    }

    @Override
    public void selectAll(JTable table) {
        String select = "select ID,Username,Statuss from users";
        db.database.fillToJTable(select, table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select ID,Username,Statuss from users where ID = " + ID;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String select = "select ID from users where "
                + "Username = '" + name + "'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }

    @Override
    public String getNameByValue(String value) {
        String select = "select Username from users where "
                + "ID = '" + value + "'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }
    
    public String getPass(String user){
        String sql = "select Pass from users where Username = '"+user+"'";
        String str = (String) db.database.getTableData(sql).items[0][0];
        return str;
    }
}
