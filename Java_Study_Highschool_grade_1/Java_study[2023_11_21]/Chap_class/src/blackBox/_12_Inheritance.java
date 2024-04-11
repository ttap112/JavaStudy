package blackBox;

import blackBox.camera.Camera;
import blackBox.camera.FactoryCam;
import blackBox.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 부모로 부터 재산을 돌려받아 자식이 사용하는 것
        // 부모 클래스에서 제공되는 모든 것들을 자식 클래스에 갖다 쓴다.
        // 자바는 하나의 부모로만 상속 받을 수 있다 | 다중 상속이 불가능

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println("-------------------------------------");

        // 카메라
        System.out.println(camera.name);
        camera.takePicture();

        System.out.println("-------------------------------------");

        // 공장 카레마
        System.out.println(factoryCam.name);
        factoryCam.recordVideo();
        factoryCam.detectFire();

        System.out.println("-------------------------------------");

        // 과속 단속 카메라
        System.out.println(speedCam.name);
        speedCam.takePicture();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();

    }
}
