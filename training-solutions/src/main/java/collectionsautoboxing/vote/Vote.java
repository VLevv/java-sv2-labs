package collectionsautoboxing.vote;

import java.util.*;

public class Vote {
    public Map<VoteResult,Integer> getResult(Map<String,VoteResult> input){
        Map<VoteResult,Integer> result=new HashMap<>();
        result.put(VoteResult.YES,0);
        result.put(VoteResult.NO,0);
        result.put(VoteResult.ABSTAIN,0);
        Iterator<VoteResult> tmp = input.values().iterator();
        VoteResult resultTmp;
        while (tmp.hasNext()){
            resultTmp = tmp.next();
            if(resultTmp.equals(VoteResult.YES)){
                result.replace(VoteResult.YES,result.get(VoteResult.YES)+1);
            }else if(resultTmp.equals(VoteResult.NO)){
                result.replace(VoteResult.NO,result.get(VoteResult.NO)+1);
            }else{
                result.replace(VoteResult.ABSTAIN,result.get(VoteResult.ABSTAIN)+1);
            }
        }
        return result;
    }
}
