/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class cylinder extends shape {
    private final double radius;
    private final double height;

    public cylinder(double r, double h) {
        super("Cylinder"); 
        radius = r;
        height = h;
    } 

    @Override
    public double area(){
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
