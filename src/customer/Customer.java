package customer;

public class Customer<T,K,V> {
    private T ID;
    private K Name;
    private V Address;

    public Customer() {

    }

    public Customer(T ID, K Name, V Address){

       this.ID = ID;
       this.Name = Name;
       this.Address = Address;
   }

    public T getID() {
        return ID;
    }

    public void setID(T ID) {
        this.ID = ID;
    }

    public K getName() {
        return Name;
    }

    public void setName(K name) {
        Name = name;
    }

    public V getAddress() {
        return Address;
    }

    public void setAddress(V address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", Name=" + Name +
                ", Address=" + Address +
                '}';
    }
}
