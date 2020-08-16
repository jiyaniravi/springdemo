package com.af.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SgtPeppers")
@Conditional(MagicExistsCondition.class)
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Peppers lonely Hearts club hand";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
