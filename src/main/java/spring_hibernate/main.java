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
//        User user = context.getBean(User.class);
//        user.setName("Radion");
//       user.setSurName("Merzlyakov");
//       user.setAge(31);
//      service.addUser(user);
//        var allUsers = service.getAllUsers();
//        System.out.println(allUsers);
//    }
//}
