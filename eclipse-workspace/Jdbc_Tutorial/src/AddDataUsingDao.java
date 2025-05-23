import java.sql.*;
import java.util.*;
public class AddDataUsingDao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		AddStudent add=new AddStudent();
		System.out.println("enter roll number and name");
		int rollNumber=sc.nextInt();
		sc.nextLine();
		String studentName=sc.nextLine();
		add.addStudent(rollNumber,studentName);
		System.out.println("Enter Y to see data");
		String yes=sc.nextLine();
		if(yes.equals("Y")) {
		  add.showData();
		}else {
			System.out.println("Task completed");
		}
		System.out.println("Do you want to delete data");
		String delete=sc.nextLine();
		if(delete.equals("yes")) {
			System.out.println("enter roll number to delete data");
			int roll=sc.nextInt();
			add.deleteData(roll);
		}else if(delete.equals("no")){
			System.out.println("Okay! we will keep it unchanged");
			System.out.println();
		}else {
			System.out.println("Invalid Input");
		}
		System.out.println("Current Data");
		add.showData();
	}

}

class AddStudent{
	public StudentData addStudent(int rollNum,String name) throws Exception {	
		StudentData std=new StudentData();

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/StData";
		String user="root";
		String pass="anshu";
		String query = "INSERT INTO StData(rollNum,sname) VALUES (?,?)";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1, rollNum);
		st.setString(2, name);
		
		int rs=st.executeUpdate();
		
		std.roll=rollNum;
		std.sname=name;
		System.out.println(rs+" row/s affected");
		
		st.close();
		con.close();
		return std;
	}
	public void showData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/StData";
		String user="root";
		String pass="anshu";
		String query = "Select * from StData order by rollNum";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rst=st.executeQuery(query);
		
		while(rst.next()) {
			System.out.println(rst.getInt(1)+" "+rst.getString(2));
		}
		st.close();
		con.close();
	}
	public void deleteData(int rollNum) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/StData";
		String user="root";
		String pass="anshu";
		String query = "Delete from StData where rollNum=?";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1,rollNum);
		int rst=st.executeUpdate();
		
		st.close();
		con.close();
	}
	
}


class StudentData{
	
	int roll;
	String sname;
}
