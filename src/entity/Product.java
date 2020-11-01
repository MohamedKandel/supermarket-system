package entity;

import javax.swing.JTable;
import supermarket.Tools;

public class Product implements maindata {

    private int ID;
    private double Price;
    private int qty;
    private String Barcode;
    private String Status;
    private String Name;
    private int Cat_ID;
    private int Brand_ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCat_ID() {
        return Cat_ID;
    }

    public void setCat_ID(int Cat_ID) {
        this.Cat_ID = Cat_ID;
    }

    public int getBrand_ID() {
        return Brand_ID;
    }

    public void setBrand_ID(int Brand_ID) {
        this.Brand_ID = Brand_ID;
    }

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

    @Override
    public void add() {
        boolean check;

        check = db.database.checkinsertion(Barcode);
        //Tools.msg(""+check);
        if (check) {
            //Tools.msg("Prudoct Found");
            String update_qty = "Update product set Qty = Qty + " + qty + " where Barcode = '" + Barcode + "'";
            db.database.RunNonQuery(update_qty);
        } else if (check == false) {
            boolean check2;
            String insert = "insert into product values (" + ID + " ,"
                    + " '" + Name + "' , "
                    + Cat_ID + " , "
                    + Brand_ID + " , "
                    + Price + " , "
                    + qty + " ,"
                    + " '" + Barcode + "' ,"
                    + " '" + Status + "')";
            db.database.RunNonQuery(insert);
        }
    }

    @Override
    public void update() {
        String update = "update product set ProName = '" + Name + "' ,"
                + " Cat_ID = " + Cat_ID + " ,"
                + " Brand_ID = " + Brand_ID + " ,"
                + " Price = " + Price + " ,"
                + " Qty = " + qty + " ,"
                + " Barcode = '" + Barcode + "' ,"
                + " Statuss = '" + Status + "' "
                + "where ID = " + ID;
        db.database.RunNonQuery(update);
    }

    @Override
    public void delete() {
        String delete = "delete from product where ID = " + ID;
        db.database.RunNonQuery(delete);
    }

    @Override
    public String getAutoNumber() {
        String auto = db.database.getAutoNumber("product_data", "ID");
        return auto;
    }

    @Override
    public void selectAll(JTable table) {
        db.database.fillToJTable("product_data", table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select * from product_data where "
                + "ID = " + ID;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String select = "select ID from product_data where "
                + "ProName = '" + name + "'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }

    @Override
    public String getNameByValue(String value) {
        String select = "select ProName from product_data where "
                + "ID = '" + value + "'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }
}
