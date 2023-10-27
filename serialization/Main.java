package serialization;

public class Main {
    public static void main(String[] args) {

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
        //                 1. Your object class 
        User user = new User();

        user.name = "Bro";
        user.password = "I<3Pizza";

        user.sayHello();
    }
}