/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sumdu.edu.ua.operations.controller;

import sumdu.edu.ua.operations.model.Vector;

/**
 *
 * @author Erlkonig
 */
public class Operations {
    
    public static Vector sum(Vector a, Vector b){
        return new Vector(a.getX()+b.getX(),a.getY()+b.getY());
    }
    public static Vector subt(Vector a, Vector b){
        return new Vector(a.getX()-b.getX(),a.getY()-b.getY());
    }
}
