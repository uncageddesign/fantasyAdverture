public abstract class Player {

    private String name;
    private String alignment;
    private Integer hitPoints;

    public Player(String name, String alignment, Integer nitPoints) {
        this.name = name;
        this.alignment = alignment;
        this.hitPoints = 100;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public String getAlignment() {

        return alignment;
    }
}
