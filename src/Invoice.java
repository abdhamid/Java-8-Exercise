public class Invoice {
    private int id;
    private String title;
    private Customer customer;
    private int amount;

    public Invoice(int id, String title, Customer customer, int amount) {
        this.id = id;
        this.title = title;
        this.customer = customer;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
