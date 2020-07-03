package contactMrgProject;

import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
    protected String name;
//    protected String lastName;
    protected String phoneNum;

//    public ContactInfo (String firstName, String lastName, String phoneNum){
////        this.firstName = firstName;
////        this.lastName = lastName;
//        this.phoneNum = phoneNum;
//    }


    public ContactInfo(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public static List<String> contactListToString(List<ContactInfo> contactInfoList){
        List<String> contactList = new ArrayList<>();
        for (ContactInfo contact : contactInfoList){
            contactList.add(contact.getName());

        }
        return contactList;
    }



    public static List<ContactInfo> contactInfoToString(List<String> contactList){
        List<ContactInfo> contactStringList = new ArrayList<>();
        for(String contact : contactList){
//            contactList.add(String.valueOf(new ContactInfo(firstName, lastName, phoneNum )));
            contactList.add(String.valueOf(new ContactInfo(contact, contact)));
        }
        return contactStringList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
