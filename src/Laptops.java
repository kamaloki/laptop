public class Laptops {
    private int id;
    private String name;
    private int operP;
    private int hardDisk;
    private String operSysten;
    private String color;

    public Laptops(int id, String name, int operP, int hardDisk, String operSystem, String color) {
        this.id = id;
        this.name = name;
        this.operP = operP;
        this.hardDisk = hardDisk;
        this.operSysten = operSystem;
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOperP() {
        return operP;
    }
    public void setOperP(int operP) {
        this.operP = operP;
    }
    public int getHardDisk() {
        return hardDisk;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public String getOperSysten() {
        return operSysten;
    }
    public void setOperSysten(String operSysten) {
        this.operSysten = operSysten;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "id: " + id +
                ", name: " + name +
                ", опер память: " + operP +
                ", Объем ЖД: " + hardDisk +
                ", Операционная система: " + operSysten +
                ", Цвет: " + color +
                '}';
    }
}
