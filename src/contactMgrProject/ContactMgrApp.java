package contactMrgProject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactMgrApp {
    public static void main(String[] args) throws IOException {
        Path textFile = Paths.get("src", "contacts.txt");//defines our path

//declare variables:
        List<ContactInfo> contactInfoList;
        List<String> contactList = new ArrayList<>();

    try{
        contactList = Files.readAllLines(textFile);
    }catch (IOException e){
        e.printStackTrace();
    }

    contactInfoList = ContactInfo.contactInfoToString(contactList);
        System.out.println(contactList);






////        === THE CODE BELOW IS USING THE HASHMAP COLLECTION ===
//        HashMap<String, Integer> newContactList = new HashMap<>();
//        newContactList.put("Bugs Bunny", 3333333);
//        newContactList.put("Betty Boop", 5555555);
//        newContactList.put("Bart Simpson", 2222222);
//        System.out.println(newContactList);
//        for (String contactName : newContactList.keySet()) {
//            System.out.println(contactName);
//        }
//        System.out.println(contactList.indexOf("Fred Flinstone 4134922649"));

//        === This is creating ContactInfo instances and adding it to an ArrayList ===

//        ContactInfo person1 = new ContactInfo("Betty", "Boop", 3671854);
//        System.out.println(person1.getFirstName());
//        ContactInfo person2 = new ContactInfo("Bugs", "bunny", 2732046);
//        List<ContactInfo> newList = new ArrayList<>();
//        newList.add(person1);
//        newList.add(person2);
//        System.out.println(newList);
//        List<String> newListStringVersion = new ArrayList<>();
//        for(ContactInfo person : newList) {
//            newListStringVersion.add(person.getFirstName());
//            System.out.println(person.getFirstName() + " " + person.getLastName());
//        }
//        for(String name : contactList) {
//            if (name.get) {
//                System.out.println(name);
//            }
//        }

    }
}
