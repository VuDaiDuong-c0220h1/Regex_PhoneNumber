public class Main {
    public static final String[] contact = new String[]{"(84)-(0978489648)", "(a8)-(22222222)", "84-012345789", "(84)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String contact : contact ){
            boolean isvalid = phoneNumber.validate(contact);
            System.out.println("Phone number " + contact + " is valid " + isvalid);
        }
    }
}
