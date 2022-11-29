/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public class paint {
    private final double coverage;
    
    public paint(double c){
        coverage = c;
    }
    
    public double amount(shape s){
        return s.area() / coverage;
    }
}
