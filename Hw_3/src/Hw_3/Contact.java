package Hw_3;

public class Contact{
    private String phone;
    private String fullNm;

    public String getFullNm() {
        return fullNm;
    }
    public void setFullNm(String fullNm) {
        this.fullNm = fullNm;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Contact(String phone, String fullNm) {
        this.phone = phone;
        this.fullNm = fullNm;
    }
    @Override
    public String toString() {
        return String.format("%s %s", fullNm, phone);
    }
    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;        
        return this.fullNm.equals(c.fullNm);
    }
}