package com.entertainment;

enum VolumePresets {MIN_VOLUME, MAX_VOLUME}

class SwitchVolumePresets {

    public static void main(String[] args) {
        int MIN_VOLUME = 0;
        int MAX_VOLUME = 100;
        //int MIN_CHANNEL = 1;
        //int MAX_CHANNEL = 999;
        VolumePresets volumePresets = VolumePresets.MIN_VOLUME;
        int result = 0;
        switch (volumePresets) {
            case MAX_VOLUME:
                result = Television.MIN_VOLUME;
                break;
            case MIN_VOLUME:
        }


    }
}