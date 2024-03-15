package optimizer;

import java.util.ArrayList;

public class IndependentJoinGroup {
    public ArrayList<String> selections;
    public ArrayList<String> projections;
    public ArrayList<String> conditions;
    public String joinString;
    public ArrayList<String> variables;

    public IndependentJoinGroup(ArrayList<String> selections, ArrayList<String> projections, ArrayList<String> conditions) {
        this.selections = selections;
        this.projections = projections;
        this.conditions = conditions;
        this.joinString = "";
        this.variables = new ArrayList<>();
    }

    public IndependentJoinGroup() {
        this.selections = new ArrayList<>();
        this.projections = new ArrayList<>();
        this.conditions = new ArrayList<>();
        this.joinString = "";
        this.variables = new ArrayList<>();
    }
}
