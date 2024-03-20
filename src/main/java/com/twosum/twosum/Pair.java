package com.twosum.twosum;

public record Pair(int nbr1, int nbr2) {


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Pair other = (Pair) obj;
        return (other.nbr2 == nbr1 && other.nbr1 == nbr2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nbr1 + nbr2;
        return result;
    }
}
