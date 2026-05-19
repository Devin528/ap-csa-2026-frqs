public class Account {
    
    private String username;

    public Account(String requestedName) {
        String username = " ";
        if (requestedName.isAvailable) {
            String username = requestedName;
        }
        else {
            int i = 1;
            while(!requestedName.isAvailable) {
                username = requestedName + i;
                i++;
            }
        }
    }
}
