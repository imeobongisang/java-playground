package com.epb.playground.review;

public class ThisXSuper {
    private int num;
    private char type;

    public ThisXSuper(int num) {
        this.num = num;
    }

    public ThisXSuper(char type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o))
            return true;
        
        if(!(o instanceof ThisXSuper))
            return false;
        
        ThisXSuper other = (ThisXSuper) o;

        return 
            num == other.num && type == other.type;
        
    }
}