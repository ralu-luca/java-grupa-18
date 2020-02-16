import java.util.List;
import java.util.ArrayList;

public class Message {
    private String phone_number;
    private String message_txt;

    public Message(String phone_number, String message_txt) {
        this.phone_number = phone_number;
        this.message_txt = message_txt;
    }


    @Override
    public String toString() {
        return "Message{" +
                "message_txt='" + message_txt + '\'' +
                '}';
    }

    public String getPhone_number() {
        return phone_number;
    }
}
