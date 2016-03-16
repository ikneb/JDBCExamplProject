/**
 * Created by Benki on 16.03.2016.
 */
public class Customer {

    private int id;
    private String name;
    private int quad;
    private int nmuber;

    public Customer(){}


    public Customer(int id,String name,int quad,int number){
        this.id = id;
        this.name = name;
        this.quad = quad;
        this.nmuber =number;
    }

    public Customer(String name,int quad,int number){

        this.name = name;
        this.quad = quad;
        this.nmuber =number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuad(int quad) {
        this.quad = quad;
    }

    public void setNmuber(int nmuber) {
        this.nmuber = nmuber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuad() {
        return quad;
    }

    public int getNmuber() {
        return nmuber;
    }
}
