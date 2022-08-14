//package spring_hibernate;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import spring_hibernate.config.AppConfig;
//import spring_hibernate.model.User;
//import spring_hibernate.service.UserService;
//
//public class main {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        UserService service = context.getBean(UserService.class);
//        User user = service.getUserById(16);
//        user.setName("ivan");
//        service.updateUser(user);
//        System.out.println(user);
//
//    }
//}
