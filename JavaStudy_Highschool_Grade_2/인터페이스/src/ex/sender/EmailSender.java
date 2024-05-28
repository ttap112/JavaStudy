package ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String text) {
        System.out.println("메시지를 발송합니다. : "+text);
    }
}
