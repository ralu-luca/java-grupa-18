import java.util.List;

public class Call {
    private String phoneNumber;
    private List<Call> calls;

    public Call(String phoneNumber, List<Call> calls) {
        this.phoneNumber = phoneNumber;
        this.calls = calls;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Call> getCalls() {
        return calls;
    }

    @Override
    public String toString() {
        return "Call{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", calls=" + calls +
                '}';
    }
}
