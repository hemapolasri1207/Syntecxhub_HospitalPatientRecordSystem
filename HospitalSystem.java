import java.sql.*;
import java.util.Scanner;

public class HospitalSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Hospital Patient Record System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Medical History");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    updatePatient();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    public static void addPatient() {
        try {
            Connection con = DBConnection2.getConnection();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Gender: ");
            String gender = sc.next();

            System.out.print("Enter Diagnosis: ");
            String diagnosis = sc.next();

            System.out.print("Enter Treatment: ");
            String treatment = sc.next();

            String query = "INSERT INTO patients(name, age, gender, diagnosis, treatment) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);
            ps.setString(4, diagnosis);
            ps.setString(5, treatment);

            ps.executeUpdate();
            System.out.println("Patient Added Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void viewPatients() {
        try {
            Connection con = DBConnection2.getConnection();

            String query = "SELECT * FROM patients";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Gender: " + rs.getString("gender"));
                System.out.println("Diagnosis: " + rs.getString("diagnosis"));
                System.out.println("Treatment: " + rs.getString("treatment"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void updatePatient() {
        try {
            Connection con = DBConnection2.getConnection();

            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Diagnosis: ");
            String diagnosis = sc.next();

            System.out.print("Enter New Treatment: ");
            String treatment = sc.next();

            String query = "UPDATE patients SET diagnosis=?, treatment=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, diagnosis);
            ps.setString(2, treatment);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated Successfully!");
            else
                System.out.println("Patient Not Found!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}