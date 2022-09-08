package practice_examples;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class DBOperations {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public DBOperations() {
		connection = MySqlConnection.getInstance();
	}
	
	public int insertDataWithStatement(Employee emp) {
		int result = 0;
		String query = "Insert into Employee values(" + emp.getId() + ",'" + emp.getName() + "'," + emp.getSalary() + ",'" + emp.getAddress() +"')";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
	
		DBOperations db = new DBOperations();
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		sc.close();
		System.out.println("Please enter emp id");
		em.setId(sc.nextInt());

	}

}
