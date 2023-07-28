/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionnew.dictionary;

import java.io.*;
import java.util.*;

/**
 *
 * @author Lenovo-PC
 */
public class FileUtility {

    public static void appendWriteToFile(String fileName, Map<String, String> text, boolean append) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", append))) {
            bw.write(text.toString());
            bw.newLine();
        }
    }

    public static void writeToFileFalse(String fileName, String text) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", false))) {
            bw.write(text);
            bw.newLine();
        }
    }
    public static void writeToFileTrue(String
            , String text) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", true))) {
            bw.write(text);
            bw.newLine();
        }
    }

}
