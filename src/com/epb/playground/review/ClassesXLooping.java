package com.epb.playground.review;

public class ClassesXLooping {
    private float right;
    private float left;
    private char opCode;
    private float result;

    public ClassesXLooping(float right, float left, char opCode){
        this.right = right;
        this.left = left;
        this.opCode = opCode;
    }

    public float getResult(){
        return result;
    }

    public float calculation(){
            switch(opCode) {
                case 'a':
                    this.result = this.left + this.right;
                    break;
                case 's':
                    this.result = this.left - this.right; 
                    break;
                case 'm':
                    this.result = this.left * this.right;
                    break;
                case 'd':
                    this.result = this.left / this.right;
                    break;          
                default :
                    System.out.println("You entered the wrong opCode");
                    break;
            }

        
        return this.result;
    }
    
}