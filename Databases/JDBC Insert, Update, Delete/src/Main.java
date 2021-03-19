import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:DB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_PHONE + " INTEGER, " +
                    COLUMN_EMAIL + " TEXT)");


            insertContact(statement, "Tim", 112233, "tim@email.com");
            insertContact(statement, "Joe", 223344, "joe@email.com");
            insertContact(statement, "Jane", 334455, "jane@email.com");
            insertContact(statement, "Peter", 445566, "peter@email.com");
            
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=551234 " +
                    "WHERE " + COLUMN_NAME + "='Peter'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS + " " +
                    "WHERE " + COLUMN_NAME + "='Jane'");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                  "VALUES('Tim', 156424, 'tim@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                  "VALUES('Joe', 616424, 'joe@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                  "VALUES('Peter', 554863, 'peter   @email.com')");
//            statement.execute("UPDATE contacts SET phone=554433 WHERE name='Joe'");
//            statement.execute("DELETE FROM contacts WHERE name='Peter'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);

            while (results.next()) {
                System.out.println(
                        results.getString(COLUMN_NAME) + " " +
                                results.getInt(COLUMN_PHONE) + " " +
                                results.getString(COLUMN_EMAIL));
            }

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " ( " +
                COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "VALUES( '" + name + "', " + phone + ", '" + email + "')");
    }
}


