package com.af.soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

    @Qualifier("SgtPeppers")
    @Autowired
    private CompactDisc disc;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(disc);
    }

}
