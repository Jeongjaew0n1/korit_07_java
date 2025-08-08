package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 접근지정자 클래스명 객체명 -> 이때까지의 작성방법과 다릅니다.
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    // 각각 다른 출력방법
    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();
    }

    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    // 각각 다른 출력방법
    public String onUpVolumeUpButton1() {
        return volumeUpButton.onUp();
    }

    public void onUpVolumeUpButton2() {
        System.out.println(volumeUpButton.onUp());
    }

}
