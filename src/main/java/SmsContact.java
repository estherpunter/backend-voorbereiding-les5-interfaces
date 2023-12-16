public class SmsContact implements ContactInfo {

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    private String sms;

    public SmsContact(String sms) {
        this.sms = sms;
    }


    @Override
    public void sendMessage() {
        System.out.println("Text message send to " + sms);
    }
}
