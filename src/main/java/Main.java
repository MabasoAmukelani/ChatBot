public class Main {

    public static void main(String[] args) {

        // Create Login object
        Login login = new Login();

        // Run system (registration + login)
        if (login.startSystem()) {

            System.out.println("\nLogin successful! Starting ChatBot...\n");

            // Start chatbot
            ChatBotpt1 bot = new ChatBotpt1();
            bot.startChat();

        } else {
            System.out.println("\nSystem exited. Login failed.");
        }
    }
}