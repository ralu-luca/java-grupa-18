public class Novel extends Book {
    private String types;

    public Novel(String name, int numOfPages, String types) {
        super(name, numOfPages);
        this.types = types;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "types='" + types + '\'' +
                '}';
    }
}