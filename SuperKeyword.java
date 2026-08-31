class Faculty {
    String name = "Faculty of Computing";

    Faculty() {
        System.out.println("Faculty constructor executed.");
    }

    void displayInformation() {
        System.out.println("Parent class method executed.");
    }
}

class Department extends Faculty {
    String name = "Department of Information Technology";

    Department() {
        super();
    }

    void displayDepartmentInformation() {
        System.out.println("Department: " + this.name);
        System.out.println("Faculty: " + super.name);
        super.displayInformation();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Department department = new Department();
        department.displayDepartmentInformation();
    }
}
