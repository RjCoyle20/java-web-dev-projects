package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(5,1);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        CheckFileExtension(studentFiles.get("Carl"));
        CheckFileExtension(studentFiles.get("Brad"));
        CheckFileExtension(studentFiles.get("Elizabeth"));
        CheckFileExtension(studentFiles.get("Stefanie"));
    }

    public static int Divide(int x, int y) {
        try {
            int dividend = x / y;

        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero!");
            ex.printStackTrace();

        }
        return x / y;
    }
    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.equals("")){
            try{
                throw new FileExtensionException("Please submit something, jabroni!");
            }catch (FileExtensionException e) {
                e.printStackTrace();
            }
            return -1;
        } else if (!fileName.equals("java")) {
            return 0;
        } else {
            return 1;
    }
    }
}