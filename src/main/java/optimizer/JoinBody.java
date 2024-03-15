package optimizer;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JoinBody {
    public ArrayList<IndependentJoinGroup> independentJoinGroups;
    public ArrayList<Pair<String, String>> joins;
    public String returnString = "";

    public String finalJoinString = "";

    public ArrayList<String> conditions = new ArrayList<>();

    public HashMap<Pair<Integer, Integer>, ArrayList<Pair<String, String>>> joinMap;

    public JoinBody(ArrayList<IndependentJoinGroup> independentJoinGroups, ArrayList<Pair<String, String>> joins) {
        this.independentJoinGroups = independentJoinGroups;
        this.joins = joins;
        this.returnString = "";
        this.joinMap = new HashMap<>();
        this.finalJoinString = "";
        this.conditions = new ArrayList<>();
    }

    public JoinBody() {
        this.independentJoinGroups = new ArrayList<>();
        this.joins = new ArrayList<>();
        this.returnString = "";
        this.joinMap = new HashMap<>();
        this.finalJoinString = "";
        this.conditions = new ArrayList<>();

    }
}
