package Clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        Class clazz = String.class; // 클래스에서 조회

        // 모든 메서드 출력
        Field[] fileds = clazz.getDeclaredFields();
        for (Field field : fileds) {
            System.out.println("Field : "+field);
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method : "+method);
        }

        // 상위 클래스 정보 출력
        System.out.println("SuperClass : "+clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface : "+i);
        }
    }
}
