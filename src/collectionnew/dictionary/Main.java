/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionnew.dictionary;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lenovo-PC
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Admin or 2.User?");
            switch (sc.next()) {
                case "Admin":
                    AdminUtil.adminMethod();
                    break;
                case "User":
                    UserUtil.userMethod();
                    break;
                default:
                    System.err.println("False choice!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Something is wrong!");
        }
        main(args);
    }
}
