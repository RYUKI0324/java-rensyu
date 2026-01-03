import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class Main {
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: 登録  2: ログイン  0: 終了");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("ユーザー名: ");
                String name = scanner.nextLine();
                System.out.print("パスワード: ");
                String pass = scanner.nextLine();

                users.add(new User(name, pass));
                System.out.println("登録完了");
            } else if (choice == 2) {
                System.out.print("ユーザー名: ");
                String name = scanner.nextLine();
                System.out.print("パスワード: ");
                String pass = scanner.nextLine();

                boolean success = false;
                for (User u : users) {
                    if (u.username.equals(name) && u.password.equals(pass)) {
                        success = true;
                        break;
                    }
                }

                if (success) {
                    System.out.println("ログイン成功");
                } else {
                    System.out.println("ログイン失敗");
                }
            } else {
                break;
            }
        }
    }
}
