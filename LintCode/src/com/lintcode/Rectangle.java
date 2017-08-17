package com.lintcode;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(3, 4);
		
		System.out.println(rectangle.getArea());
	}
	/*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    public float width;
    public float height;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public float getArea(){
        return width * height;
    }
}
