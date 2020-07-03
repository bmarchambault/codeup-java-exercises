package contactMgrProject;

import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
    protected String firstName;
    protected String lastName;
    protected String phoneNum;

    public ContactInfo (String firstName, String lastName, String phoneNum){
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.phoneNum = phoneNum;
    }

        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

//
//    public static List<ContactInfo> contactInfoList(List<String>)


}
