package entity;

public class Position {
    public byte positionId;
    public EnumTypeQuestion.EnumPosition PositionName;

    public Position() {
    }

    public Position(byte positionId, EnumTypeQuestion.EnumPosition positionName) {
        this.positionId = positionId;
        PositionName = positionName;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", PositionName=" + PositionName +
                '}';
    }
}
