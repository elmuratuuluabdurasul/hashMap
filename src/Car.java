public class Car {
    private int id;
    private String nomer;

    public Car(int id, String nomer) {
        this.id = id;
        this.nomer = nomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomer='" + nomer + '\'' +
                '}';
    }
}
