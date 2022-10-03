package com.comarch;

public class Cat extends Pet {

    public boolean equals(Object o) {
        return ((Cat) o).name.equals(this.name);
    }
}
