package OOPI;

public class gekteresekter {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        gekteresekter obj = new gekteresekter();

        obj.setName("Felicio");
        System.out.println("My name is :" + obj.getName());
    }
}
