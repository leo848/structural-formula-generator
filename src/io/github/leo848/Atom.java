package io.github.leo848;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Atom {
    private String name;
    private int protons;
    private int neutrons;
    private int electrons;
    private int outerShellElectrons;

    ArrayList<Atom> bonds = new ArrayList<>();


    public Atom(String name, int protons, int neutrons, int electrons) {

    }

    public void addBond(Atom atom) {
        bonds.add(atom);
        atom.bonds.add(this);
    }

    public void removeBond(Atom atom) {
        atom.bonds.remove(this);
        bonds.remove(atom);
    }

    public void printMolecule() {

    }

    public int getOuterShellElectrons() {
        return outerShellElectrons;
    }


    public int getProtons() {
        return protons;
    }

    public int getNeutrons() {
        return neutrons;
    }

    public int getElectrons() {
        return electrons;
    }
}
