/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.operations.model;

/**
 *
 * @author Erlkonig
 */
public class Vector {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Vector(int xx, int yy) {
      this.x=xx;
      this.y=yy;
    }
    
    @Override
    public String toString(){
    return "(x="+x+";y="+y+")";
    }
}
