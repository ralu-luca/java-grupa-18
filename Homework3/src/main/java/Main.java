public class Main {
    public static void main(String[] args) {
        Phone phone = new SamGlS6();

        phone.addContact("1", "0752789325", "John", "Smith");
        phone.addContact("2", "0726857921", "Jane", "Doe");
        phone.addContact("3", "0766589625", "Rex", "Marshal");
        phone.addContact("4", "0788547658", "Axl", "Rose");
        System.out.println("Phone's contaclist: ");
        phone.listContacts();
        System.out.println();


        phone.sendMessage(phone.getContact(1).getPhone_number(),  "First message");
        phone.sendMessage("0752789325",  "Second message");
        phone.sendMessage("0726857921", "Hello");
        System.out.println("Messages to the first contact " + phone.getContact(1).getFirst_name() + " " + phone.getContact(1).getLast_name() + ": ");
        phone.listMessages("0752789325");
        System.out.println();


        phone.call(phone.getContact(2).getPhone_number());
        phone.call(phone.getContact(3).getPhone_number());
        System.out.println();
        System.out.println("Call history ");
        phone.listCallHistory();
        System.out.println();

        System.out.println("Your phone's battery life: " + ((SamGlS6) phone).getCurrentBatteryLife());
        System.out.println();


        Phone phone1 = new SamGIS7();

        phone1.addContact("1" , "0721502389", "Bonn", "Scott");
        phone1.addContact("2", "0751285647", "Cristian", "Light");
        System.out.println("Phone1's contaclist: ");
        phone1.listContacts();
        System.out.println();

        System.out.println("Your phone1's battery life: " + ((SamGIS7) phone1).getCurrentBatteryLife());
        System.out.println();

        phone1.sendMessage(phone1.getContact(1).getPhone_number(), "First message");
        phone1.sendMessage(phone1.getContact(2).getPhone_number(), "Second message");
        phone1.sendMessage("0751285647", "Third message");
        System.out.println("Messages to the first contact " + phone1.getContact(1).getFirst_name() + " " + phone1.getContact(2).getLast_name() + ": ");
        phone1.listMessages(phone1.getContact(1).getPhone_number());
        System.out.println();

        System.out.println("Your phone1's batteryLife " + ((SamGIS7) phone1).getCurrentBatteryLife());
        System.out.println();

        phone1.call("0721502389");
        System.out.println("Your phone1's batteryLife " + ((SamGIS7) phone1).getCurrentBatteryLife());
        phone1.call(phone1.getContact(2).getPhone_number());
        System.out.println();

        System.out.println("Your call history: ");
        phone1.listCallHistory();



    }
}
