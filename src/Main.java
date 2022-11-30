import com1.Gender;
import dao.MyException;
import model.User;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
         userService.addUser(new User(1, "Jenny", 28, Gender.FEMALE));
         userService.addUser(new User(2, "Alisa", 45, Gender.FEMALE));
         userService.addUser(new User(3, "Dima", 10, Gender.MALE));
         try {
             System.out.println(userService.findById(2));
             System.out.println(userService.getAllUsers());
             System.out.println(userService.deleteById(1));
             System.out.println(userService.getAllUsers());
         } catch (MyException e) {
             System.out.println(e.getMessage());
         }
    }
}



