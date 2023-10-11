package com.monje.lab10.controller;

import com.monje.lab10.user.User;

import java.io.File;
import java.io.FileWriter;

public class controller {

    //function generate csv file
    public void generateCSV(User user) {
        try {
            String path = "src/main/java/com/monje/lab10/data/user.csv";
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(path, true);

            if (file.length() == 0) {
                fileWriter.write("Nombre, Apellido, Edad, Direccion, Genero\n");
            }
            fileWriter.write(user.getName() + "," + user.getLastName() + "," + user.getAge() + "," + user.getDirection() + "," + user.getGender() + "\n");

            fileWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred." + e.getMessage());
        }
    }

}
