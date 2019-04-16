
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mca241
 */
public class DatabaseHelper {

    Connection connection;
    ArrayList<MyShoppingItems> shoppingList; 
    
    
    public DatabaseHelper() {
        
        getConnection();
        shoppingList = getShoppingItems();
        
    }
    
    private void getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
           
            String url = "jdbc:mysql://localhost:3306/shopping_database";
             Class.forName(driver);
            connection = DriverManager.getConnection(url,"root","");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private ArrayList<MyShoppingItems> getShoppingItems(){
        ArrayList<MyShoppingItems> itemList = new ArrayList<>();
        return itemList;
    }
    
    private int insertRecord(MyShoppingItems s){
        return 0;
        
    }
    
    private int updateRecord(MyShoppingItems s){
        return 0;
        
    }
    
    private int deleteRecord(int id){
        return 0;
        
    }
    
}
