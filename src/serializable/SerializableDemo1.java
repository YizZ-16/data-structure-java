package serializable;

import java.io.*;

/**
 * Created by lc114 on 2017/8/7.
 */
public class SerializableDemo1 {

    public static void main(String[] args) {

        User1 user = new User1();
        user.setName("hollis");
        user.setAge(23);
        user.setHeight(2);
        System.out.println(user.toString());

        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("./src/serializable/tempFile"));
            oos.writeObject(user);
            oos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        File file = new File("./src/serializable/tempFile");
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(file));
            User1 newUser = (User1)ois.readObject();
            System.out.println(newUser);
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
