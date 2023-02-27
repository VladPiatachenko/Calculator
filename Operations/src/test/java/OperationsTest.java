/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sumdu.edu.ua.operations.controller.Operations;
import sumdu.edu.ua.operations.model.Vector;

/**
 *
 * @author Oksana
 */
public class OperationsTest {
    @Test
    public void sumTest(){
        Vector a=new Vector((1 + (int)(Math.random() * 10)),(1 + (int)(Math.random() * 10)));
        Vector b=new Vector((1 + (int)(Math.random() * 10)),(1 + (int)(Math.random() * 10)));;
        Vector c=new Vector(a.getX()+b.getX(),a.getY()+b.getY());
        System.out.println(c.toString());
        System.out.println(Operations.sum(a,b).toString());
        assertEquals(c.toString(),Operations.sum(a,b).toString());
        }
     @Test
    public void subtTest(){
        Vector a=new Vector((1 + (int)(Math.random() * 10)),(1 + (int)(Math.random() * 10)));
        Vector b=new Vector((1 + (int)(Math.random() * 10)),(1 + (int)(Math.random() * 10)));;
        Vector c=new Vector(a.getX()-b.getX(),a.getY()-b.getY());
        System.out.println(c.toString());
        System.out.println(Operations.subt(a,b).toString());
        assertEquals(c.toString(),Operations.subt(a,b).toString());
        }
}
