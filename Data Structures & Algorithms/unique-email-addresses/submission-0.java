class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> email = new HashSet<>();

        for(String mail : emails){
            String[] mailPart = mail.split("@");
            char[] local = mailPart[0].replace(".","").toCharArray();
            String newLocal = "";
            for(char x : local){
                if(x == '+') break;
                newLocal = newLocal + x;
            }
            System.out.println(newLocal + "@" + mailPart[1]);
            email.add(newLocal + "@" + mailPart[1]);
        }

        return email.size();
    }
}