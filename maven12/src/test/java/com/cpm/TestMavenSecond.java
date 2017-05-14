package com.cpm;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAMES on 2017/5/13.
 */
public class TestMavenSecond {

    @Test
    public void testSayHello(){
        MavenFirst mf = new MavenFirst();
        String result = mf.sayHello("cpm");
        Assert.assertEquals("cpm says hello!", result);
    }

}
