package com.gla.streamApi;
public class SmartLightingSystem{

    public static void main(String[] args) {

        // Motion detected → Turn on bright white lights
        LightAction motionTrigger = () -> {
            System.out.println("Motion detected: Turning on bright white lights.");
        };

        // Nighttime → Dim warm lights
        LightAction nightTrigger = () -> {
            System.out.println("Night mode: Activating dim warm lights.");
        };

        // Voice command → Party mode
        LightAction voiceTrigger = () -> {
            System.out.println("Voice command received: Activating party lighting (color cycle).");
        };

        // Execute actions
        triggerEvent("motion", motionTrigger);
        triggerEvent("night", nightTrigger);
        triggerEvent("voice", voiceTrigger);
    }

    public static void triggerEvent(String trigger, LightAction action) {
        System.out.println("Trigger: " + trigger);
        action.execute();
    }
}