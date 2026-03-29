// This project follows MVC architecture for better modularity
public class Main {

    public static void main(String[] args) {

        Student model = new Student();

        model.setName("Sarfaraj");
        model.setRollNumber(101);
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Updated Sarfaraj");

        controller.updateView();
    }
}
