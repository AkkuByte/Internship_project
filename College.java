import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Course: " + course);
    }
}

public class College {

    // Encapsulated Student Class
    public static void main(String[] args) {
        ArrayList<Student> database = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding Data dynamically
        database.add(new Student(101, "Akash Kumar", 20, "Computer Science"));
        database.add(new Student(102, "Pawan Kumar", 22, "Mechanical Engineering"));
        
        // User input loop
        while (true) {
            System.out.print("\nDo you want to add a new student? (yes/no): ");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("no")) {
                break;
            } else if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
                continue;
            }
            
            try {
                System.out.print("Enter Student ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Student Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Enter Student Course: ");
                String course = scanner.nextLine();
                
                database.add(new Student(id, name, age, course));
                System.out.println("Student added successfully!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! ID and Age must be numbers. Please try again.");
            }
        }

        System.out.println("\n--- All Student Records ---");
        for (Student s : database) {
            s.display();
        }
        
        scanner.close();
    }
}