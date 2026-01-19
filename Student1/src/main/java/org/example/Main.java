import java.sql.*;

public class Main {

    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "afrin";


        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            con = DriverManager.getConnection(url, user, password);


            stmt = con.createStatement();


            rs = stmt.executeQuery("SELECT * FROM students");


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
