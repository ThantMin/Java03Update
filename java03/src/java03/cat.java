package java03;

/**
 * <h2>4{type_name}Class</h2>
 * <p>
 * Process for Displayingcat
 * </p>
 *
 * @author ASUS
 *
 */
public class cat {
    /**
     * <h2>name</h2>
     * <p>
     * setName
     * </p>
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h2>age</h2>
     * <p>
     * setAge
     * </p>
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * <h2>color</h2>
     * <p>
     * setColor
     * </p>
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    String name;
    int age;
    String color;

    public cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // method
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    // Constructor

    public String toString() {
        return ("Name is " + this.getName() + "Age is " + this.getAge() + "Color is `" + this.getColor());
    }

    public static void main(String args[]) {
        cat pop = new cat("pop", 3, "white");
        System.out.println(pop);
    }
}
