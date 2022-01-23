package collectionsautoboxing.vote;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void getResult() {
        Vote vote =new Vote();
        Map<VoteResult,Integer> testRes= vote.getResult(Map.of(
                "John Doe",VoteResult.YES,
                "John Doe1",VoteResult.YES,
                "John Doe2",VoteResult.YES,
                "John Doe3",VoteResult.YES,
                "John Doe4",VoteResult.YES,
                "John Doe5",VoteResult.NO,
                "John Doe6",VoteResult.NO,
                "John Doe7",VoteResult.NO,
                "John Doe8",VoteResult.ABSTAIN
                ));
        assertEquals(5,testRes.get(VoteResult.YES));
        assertEquals(3,testRes.get(VoteResult.NO));
        assertEquals(1,testRes.get(VoteResult.ABSTAIN));
    }
}