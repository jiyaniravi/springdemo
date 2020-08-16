package com.af.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TSeries")
public class TSeries implements CompactDisc{
    @Override
    public void play() {
        System.out.println("Ankit Tiwaris : 'Sun raha he na tu!'");
    }
}
