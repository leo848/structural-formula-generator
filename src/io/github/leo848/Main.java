package io.github.leo848;

public class Main {
    public static void main(String[] args) {
        Atom h = new Atom("Hydrogen", 1, 0, 1);
        Atom o = new Atom("Oxygen", 8, 8, 8);

        h.addBond(o);
        h.printMolecule();

    }
}
