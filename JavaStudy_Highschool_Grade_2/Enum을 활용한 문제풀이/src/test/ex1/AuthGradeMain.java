package test.ex1;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            AuthGrade.authGradePrint(authGrade.getLevel(), authGrade.getName());
        }
    }
}
