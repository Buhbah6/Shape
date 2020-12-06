package oop;

import java.util.Random;

/**
 *
 * @author thego
 */
public class Rectangular {
    private double length;
    private double width;
    private String colour;
    
    public Rectangular() {
        Random rand = new Random();
        this.width = rand.nextInt(10) + 1;
        this.length = rand.nextInt(10) + 1;
        this.colour = "Black";
    }
    
    public Rectangular(double length, double width, String colour) {
        this.width = width;
        this.length = length;
        this.colour = colour;
        
    }
    
    public double calcPerimeter() {
        return (length + width) * 2;
    }
    
    public double calcArea() {
        return length * width;
    }
    
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.colour = rectangular.colour;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-10s: %f\n", "Length", length);
        str += String.format("%-10s: %f\n", "Width", width);
        str += String.format("%-10s: %s\n", "Colour", colour);
        str += String.format("%-10s: %f\n", "Perimeter", calcPerimeter());
        str += String.format("%-10s: %f\n", "Area", calcArea());
        return str;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    
    
}
