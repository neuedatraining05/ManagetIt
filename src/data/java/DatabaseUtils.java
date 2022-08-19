import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;




import domain.ExpenseClaim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


        public class DatabaseUtils {
        public void saveData (List<ManagementIt> mangCalls) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calls","root", "c0nygre");

            mangCalls.stream().forEach( call -> {
                try {
                    Statement statement = connection.createStatement();
                    String command = "INSERT INTO calls (staffId, numbCalss, issuesType,issueObject,serevity) VALUES (" +
                            call.getStaffId() + "," +
                            call.getNumbCalss() + "," +
                            call.getIssueType()+","+
                            call.getIssueObject()+","+
                            call.getSeverity() " ) ";
                    statement.execute(command);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });
        }
    }


