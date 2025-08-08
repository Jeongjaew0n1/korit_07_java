package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(PowerButton(),
//                                            ChannelDownButton(), ChannelUpButton());
//        PowerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

//        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(),
//                new ChannelDownButton(), new ChannelUpButton(),
//                new VolumeDownButton(), new VolumeUpButton());
//
//        tvRemoteController.onPressedPowerButton();
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//        tvRemoteController.onPressedChannelUpButton();
//
//        System.out.println(tvRemoteController.onUpChannelUpButton1());
//        tvRemoteController.onUpChannelUpButton2();
//
//        tvRemoteController.onPressedVolumeDownButton();
//        tvRemoteController.onDownVolumeDownButton();
//        tvRemoteController.onPressedVolumeUpButton();
//
//        System.out.println(tvRemoteController.onUpVolumeUpButton1());
//        tvRemoteController.onUpVolumeUpButton2();
//
//        tvRemoteController.onPressedPowerButton();

        AirConditionerController airConditionerController = new AirConditionerController(new PowerButton(),
                new TemperatureDownButton(), new TemperatureUpButton(), new ModeChangeButton());


        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        airConditionerController.onUpTemperatureUpButton();
        airConditionerController.modChangeButton();
        airConditionerController.modChangeButton();
        airConditionerController.onPressedPowerButton();

    }
}
