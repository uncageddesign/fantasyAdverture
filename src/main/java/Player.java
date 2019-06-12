public abstract class Player {

    private String name;
    private String alignment;

    public Player(String name, String alignment) {
        this.name = name;
        this.alignment = alignment;
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
