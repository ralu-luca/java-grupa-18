import java.util.List;

public interface Phone {
    Contact[] addContact(String nr, String phone_number, String first_name, String last_name);

    void listContacts();

    Message[] sendMessage(String phone_number, String message_txt);

    void listMessages(String phone_number);

    String[] call(String phone_number);

    void listCallHistory();

    Contact getContact(int index);

}
