package javaSE.Collections;

public class GenericsData<T> {

    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public GenericsData(T name) {
        this.name = name;
    }

    /*
    public static void main(String[] args) {
        GenericsData genericsData = new GenericsData();
        genericsData.setName(true);
        System.out.println(genericsData.getName());
    }
     */
}
