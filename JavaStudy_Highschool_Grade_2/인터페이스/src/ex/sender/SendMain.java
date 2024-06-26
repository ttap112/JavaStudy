package ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders ={new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다.");
        }
    }
}

/*
다중 메시지 발송
- 한 번에 여러곳에 메시지를 발송하는 프로그램을 개발한다.
- 메인 코드를 보고 클래스를 완성하시오

요구 사항
1. 다형성을 활용해야 한다
2. Sender 인터페이스를 구현하고 사용해야 한다
3. EmailSender.java, SmsSender.java, FaceBookSende.java를 구현하시오

실행결과
이메일을 발송합니다 : 환영합니다
SMS를 발송합니다. : 환영합니다
페이스북을 발송합니다 :
 */