/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class PaintThings {
    public static void main (String[] args) 
  {
    final double COVERAGE = 350;
    paint lukis = new paint(COVERAGE);
    rectangle deck;
    sphere bigBall; 
    cylinder tank;
    double deckAmt, ballAmt, tankAmt;

    deck = new rectangle(20, 30); 
    bigBall = new sphere(15);
    tank = new cylinder(10, 30);

    deckAmt = lukis.amount(deck);
    ballAmt = lukis.amount(bigBall);
    tankAmt = lukis.amount(tank);
    
    DecimalFormat fmt = new DecimalFormat("0.#"); 
    System.out.println ("\nNumber of gallons of paint needed...");
    System.out.println ("Deck " + fmt.format(deckAmt)); 
    System.out.println ("Big Ball " + fmt.format(ballAmt)); 
    System.out.println ("Tank " + fmt.format(tankAmt));
  } 
}
