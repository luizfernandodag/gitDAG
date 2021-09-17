package Spring.web.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptPassword {
    public static void main(String[] args) {
        String password = "123";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("Password: " + password);
        System.out.println("Password encriptado: " + encrypt(password));
    }
    public static String encrypt(String password)
    {


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
