package com;

public class Struct {
    String str = "";
    int size = 0;

    public Struct(String str, int size) {
        this.str = str;
        this.size = size;
    }

    public Struct() {
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Struct other = (Struct) obj;
        if (this.str.equals(other.str))
            return true;
        if (!this.str.equals(other.str))
            return false;
        return true;
    }
    
    public int compareTo(Struct comparev) {
        int comparenew = comparev.getSize();
        return comparenew - this.size;
    }

    public int getSize() {
        return size;
    }
}