package export;
import java.sql.*;

public class ConnectionGlobal {
    public static String host;
    public static String port;
    public static String database;
    public static String user;
    public static String password;
    public static Connection con = null;
    public static Statement st = null;
    public static ResultSet rs = null;
    public static String path;
    public static String SQL;


}
