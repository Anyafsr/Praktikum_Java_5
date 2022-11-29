/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class rectangle extends shape{
    private final double length;
    private final double width;
    
    public rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    
    @Override
    public double area(){
        return length * width;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of length " + length + " and width " + width;
    }
}
