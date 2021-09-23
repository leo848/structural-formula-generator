package io.github.leo848;

import java.util.ArrayList;
import java.util.Objects;

@SuppressWarnings("unused")
public class Atom {
    public String getName() {
        return name;
    }

    private String name;
    private int protons;
    private int neutrons;
    private int electrons;
    private int outerShellElectrons;

    ArrayList<Atom> bonds = new ArrayList<>();


    public Atom(String name, int protons, int neutrons, int electrons) {
        this.name = name;
        this.protons = protons;
        this.neutrons = neutrons;
        this.electrons = electrons;
    }

    public void addBond(Atom atom) {


        bonds.add(atom);
        atom.bonds.add(this);
        bonds.removeIf(e -> !e.equals(this));
    }

    public void removeBond(Atom atom) {
        atom.bonds.remove(this);
        bonds.remove(atom);
        bonds.removeIf(e -> !e.equals(this));
    }

    public void printMolecule() {
        ArrayList<Atom> accessedAtoms = new ArrayList<>();
        System.out.println(this);
        accessedAtoms.add(this);

        for (Atom bond : bonds) {
            System.out.println(bond);
            if (accessedAtoms.contains(bond)) continue;

            System.out.println(bond);
            accessedAtoms.add(bond);
        }
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

    public String getBonds(){
        StringBuilder returnBonds = new StringBuilder();
        for (Atom bond : bonds) {
            returnBonds.append(bond.getName());
        }

        return returnBonds.toString();
    }

    @Override
    public String toString() {
        return "Atom{" +
                "name='" + name + '\'' +
                ", protons=" + protons +
                ", neutrons=" + neutrons +
                ", electrons=" + electrons +
                ", outerShellElectrons=" + outerShellElectrons +
                ", bonds=" + getBonds() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atom atom)) return false;
        return protons == atom.protons && neutrons == atom.neutrons && electrons == atom.electrons && outerShellElectrons == atom.outerShellElectrons && name.equals(atom.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protons, neutrons, electrons, outerShellElectrons);
    }
}
