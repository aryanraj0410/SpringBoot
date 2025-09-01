package in.aryan.main;

import in.aryan.beans.Student;

public class Main {
    public static void main(String[] args) {
        Stirng config_loc = "/in/aryan/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student std = (Student) context.getBean("StdId");
        std.display();
    }
}
