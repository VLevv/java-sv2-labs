package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> members=new ArrayList<>();

    public Family(List<FamilyMember> members) {
        this.members = members;
    }

    public List<FamilyMember> getMembers() {
        return members;
    }

    public void addFamilyMember(FamilyMember member){
        members.add(member);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name){
        List<Integer> results=new ArrayList<>();
        for (FamilyMember member:
             members) {
            if(member.getName().contains(name)){
                results.add(member.getAge());
            }
        }
        return results;
    }
}
