package interface_vs_abstract.abstract_;

import interface_vs_abstract.interface_.Report;

public class Bike implements Report {

    public int reportSpeed() {
        return 15;
    }

    public int reportMaxWeight() {
        return 5;
    }
}
