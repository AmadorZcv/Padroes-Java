/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amador
 */
public class Prototype {
    public static void main(String[] args) {
        
        try {
            CampanhaAnual campanha = new CampanhaAnual();
        } catch (CloneNotSupportedException ex) {
            System.out.println("What?");
        }
        
          
    }
}
