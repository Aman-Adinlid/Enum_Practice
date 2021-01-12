package Lexicon;

public class flower {

    private int Id;
    private String name;
    private Color color;

    public flower() {
    }


    public flower(int id, String name, Color color) {
        Id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "flower{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
