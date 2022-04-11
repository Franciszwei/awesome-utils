package com.rude3knife.commonutils;

import com.rude3knife.commonutils.utils.DateTimeUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mytest {

    @Test
    public void test01(){
        assertEquals("00:30", DateTimeUtil.formatDuration(30));
    }
}
