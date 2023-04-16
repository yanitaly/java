package deserializer;

import java.io.*;

public class Deserialize {
	
	public static void main(String [] args) {
		
		User user = null;
        FileInputStream fileIn;
        
        try {
		    System.out.println("name: ");
			fileIn = new FileInputStream("res/employee.ser");

	        ObjectInputStream in = new ObjectInputStream(fileIn); 
	        user = (User) in.readObject();

	        in.close();
	        fileIn.close();
	        // TODO verify byte file input not working!!!!!!!!!!
	        System.out.println("Object read OK!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: "+serialVersionUID);   
        System.out.println("name: " + user.name);
        System.out.println("password: " + user.password);

        user.hello();
      
   }
}