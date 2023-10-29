package serialization;

import java.io.*;

public class deserialization {
    //                  Steps to Deserialize
    //                  -----------------------------------------------
    //                  1. Declare your object (don't instantiate)
    //                  2. Your class should implement Serializable interface
    //                  3. add import java.io.Serializable;
    //                  4. FileInputStream fileIn = new FileInputStream(file path);
    //                  5. ObjectInputStream in = new ObjectInputStream(fileIn);
    //                  6. objectName = (Class) in.readObject();
    //                  7. in.close(); fileIn.close();
    //                  -----------------------------------------------

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        User user = null;
        FileInputStream fileIn = new FileInputStream("D:\\java_projects\\learn-java-repository\\serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
