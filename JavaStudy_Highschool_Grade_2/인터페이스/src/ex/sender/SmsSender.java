package ex.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String text) {
        System.out.println("SMS에 발송합니다 : "+text);
    }
}
