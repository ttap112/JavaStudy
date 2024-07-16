package test.ex1;

public enum AuthGrade {
    GUEST(1,"손님"),LOGIN(2,"로그인 회원"),ADMIN(3,"어드민");

    private final int level;
    private final String name;

    AuthGrade(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
    public static void authGradePrint(int level, String name) {
        System.out.println(name+"의 등급은 레벨 "+level+" 입니다.");
    }
}
