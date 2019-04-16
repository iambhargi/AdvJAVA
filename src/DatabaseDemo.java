
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.jar.JarInputStream;
import javax.swing.JOptionPane;


public class DatabaseDemo {

        public static void main(String[] args) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/shopping_database";
            
            
            Connection cn = DriverManager.getConnection(url,"root","");
            java.sql.Statement st = cn.createStatement();
            //String query = "SELECT * FROM shopping_items";
            //String query1 = "Select * from shopping_items where id = 5";
            //String query2 = "select c.name, s.price from category_items as c and shopping_items as s where c.id=s.category_id"; 
            
            Scanner sc = new Scanner(System.in);
            
            String name =JOptionPane.showInputDialog("Enter the name to Insert");
            
            String insQuery = "INSERT INTO category_items(name) values('"+ name  + "')";
            
            st.executeUpdate(insQuery);
            String query = "Select * from category_items";
             ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                String name1 = rs.getString(2);//by column number
                System.out.println(name1);
                //double price = rs.getDouble("price");//by column name
                //System.out.println(name+" | "+price);
            }
            
            cn.close();
            
            
            /* String name2 =JOptionPane.showInputDialog("Enter the name to Insert");
            
            String insQuery2 = "update category_items(name) set name='"+ name2 + "') where id=1";
            
            st.executeUpdate(insQuery2);
            String query2 = "Select * from category_items";*/
         
            
       
            
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
