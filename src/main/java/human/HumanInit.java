package human;

public class HumanInit {
    private String name;
    private long humanId;
    private long humanPositionX;
    private long humanPositionY;

    public HumanInit(String name, long humanId, long humanPositionX, long humanPositionY) {
        this.name = name;
        this.humanId = humanId;
        this.humanPositionX = humanPositionX;
        this.humanPositionY = humanPositionY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHumanId() {
        return humanId;
    }

    public void setHumanId(long humanId) {
        this.humanId = humanId;
    }

    public long getHumanPositionX() {
        return humanPositionX;
    }

    public void setHumanPositionX(long humanPositionX) {
        this.humanPositionX = humanPositionX;
    }

    public long getHumanPositionY() {
        return humanPositionY;
    }

    public void setHumanPositionY(long humanPositionY) {
        this.humanPositionY = humanPositionY;
    }
}
