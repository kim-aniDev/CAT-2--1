class AcademicDepartment {
    private String confidentialCode = "DIT-SECURE";

    AcademicDepartment() {
        System.out.println("AcademicDepartment constructor executed.");
    }

    final void displayPolicy() {
        System.out.println("Department policy is final and cannot be overridden.");
    }

    protected void displayDepartment() {
        System.out.println("Department of Information Technology");
    }
}

class InformationTechnologyDepartment extends AcademicDepartment {
    InformationTechnologyDepartment() {
        super();
    }

    void displayDetails() {
        displayDepartment();
        // confidentialCode cannot be accessed directly because it is private.
        // displayPolicy() cannot be overridden because it is final.
    }
}

public class InheritanceRestrictions {
    public static void main(String[] args) {
        InformationTechnologyDepartment department =
                new InformationTechnologyDepartment();
        department.displayDetails();

        // Java classes cannot use multiple inheritance:
        // class InvalidDepartment extends AcademicDepartment, AnotherDepartment { }
    }
}
