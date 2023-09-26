/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

public class Manage {
     private final String[] MAIN_MENU_ITEMS = {
        " Normalize Text",
        " Exit",};

    Algorithm algorithm = new Algorithm();

    Menu mainMenu = new Menu("===== MENU =====", MAIN_MENU_ITEMS) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    algorithm.normalize();
                    break;
                case 2:
                    System.exit(0);
                    break;

            }
        }
    };

    public void run() {
        mainMenu.run();
    }
}
