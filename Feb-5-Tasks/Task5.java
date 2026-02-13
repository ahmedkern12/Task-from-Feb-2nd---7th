class Task5 {
    static int totalLogins = 0;
    int sessionId;

    Task5(int sessionId) {
        this.sessionId = sessionId;
        totalLogins++;
        System.out.println("Total Logins: " + totalLogins);
    }

    public static void main(String[] args) {
        new Task5(101);
        new Task5(102);
        new Task5(103);
    }
}
