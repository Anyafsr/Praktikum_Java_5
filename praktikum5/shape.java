/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author User
 */
public abstract class shape {
    protected String shapename;
    
    public shape(String name){
        shapename = name;
    }
    
    public abstract double area();
    
    @Override
    public String toString(){
        return shapename;
    }
}
