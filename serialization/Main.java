package serialization;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        // Serialization = The process of converting an object into a byte stream(поток байтов).
        //                 Persists(Сохраняется) (savest the stats(статистику)) the object after program exits(выхода из программы)
        //                 This byte stream can be saved as a file or sent over a network
        //                 Can be sent to a different machine
        //                 Byte stream can be saved as a file (.ser) which is platform independent
        //                 (Think of this as if (как будто)you're saving a file with the object's information)


        // Deserialization = The reverse process of converting a byte stream into an object.
        //                   (Think of this as if you're loading a saved file)

        //                 Stemps to Serialize
        //                 -----------------------------------------------------------------------------
        //                 1. Your object class should implement Serializable interface
        //                 2. add import java.io.Serializable;
        //                 3. FileOutputStream fileOut = new FileOutputStream(file path)
        //                 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //                 5. out.writeObject(objectName)
        //                 6. out.close(); fileOut.close();

        // important notes  1. children classes of a parent class that implements Serializable will do so as well(таже будут делать это)
        //                  2. static fields are not serialized (they belong(принадлежат) to the class, not an individual object) 
        //                  3. the class's definition ("class file") itself is not recorded(записывается), cast it as the object type(приведите его в качестве объекта)
        //                  4. Fields declared as "transient(временные)" aren't serialized, they're ignored
        //                  5. serialVersionUID is a unique version ID for a class that is serializable(уникальна идентификатор версии)
        User user = new User();

        user.name = "Bro Code";
        user.password = "password123";

        Path currRelativePath = Paths.get("");
        FileOutputStream fileOut = new FileOutputStream(currRelativePath.toAbsolutePath().toString() + "\\serialization\\UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}