package com.banixc.softwaretest6_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static com.banixc.softwaretest6_2.Formulas.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CoverageTest {

    private static final int CLIP = 0;
    private static final int MAX = 1;

    private int expected;
    private int result;

    public CoverageTest(int index){
        int type;
        if(index < clipCaseList.length) type = CLIP;
        else {
            type = MAX;
            index -= clipCaseList.length;
        }

        if(type == CLIP) {
            expected = clipCaseList[index][3];
            result = clip(clipCaseList[index][0],clipCaseList[index][1],clipCaseList[index][2]);
        } else {

            expected = maxCaseList[index][3];
            result = max(maxCaseList[index][0],maxCaseList[index][1],maxCaseList[index][2]);
        }

    }

    private static int[][] clipCaseList= new int[][]{
            {1,10,0,1},
            {1,10,2,2},
            {1,10,11,10}
    };

    private static int[][] maxCaseList= new int[][]{
            {1,2,3,3},
            {1,3,2,3},
            {2,1,3,3},
            {2,3,1,3},
            {3,2,1,3},
            {3,1,2,3}
    };

    @Parameterized.Parameters
    public static Collection data(){
        List<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < clipCaseList.length + maxCaseList.length ; i++)
            list.add(i);
        return list;
    }

    @Test
    public void testCoverage() {
        assertEquals(expected,result);
    }
}
