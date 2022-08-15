public class HelloWorld {

    public String user;

    public void welcomeMessage() {
        System.out.println("Hello, this is " + user + "!");
    }

    public HelloWorld(String userName) {
        this.user = userName;
        //Calls a welcome messsage upon creating a new instance of HelloWorld Class with users name
        welcomeMessage();
    }

    public static void main(String[] args) {
        //Random fist System Print calls
        System.out.println("Hello World, this is my first GitHub project!");
        System.out.println("What does a push do?");
        System.out.println("What else should I add?");

        //Create a new HelloWorld object named user1 that takes in a String as userName
        HelloWorld user1 = new HelloWorld("Joe");

        /*
        This is another way to call welcome message
        user1.welcomeMessage();
        */

    }
}
