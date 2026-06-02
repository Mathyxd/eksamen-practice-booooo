package eksamen7;

public class Beer {
    private String name;
    private int alcoholPercentage;
    private int price;

    public Beer(String name, int alcoholPercentage, int price) {
        this.name = name;
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
    }

    public String getName() {
        return name;
    }
    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAlcoholPercentage(int alcoholPercentage) {
        if (alcoholPercentage < 0 || alcoholPercentage > 100) {
            throw new IllegalArgumentException("ugyldig procenter: " + alcoholPercentage);
        }
        this.alcoholPercentage = alcoholPercentage;
    }
    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("prisen må ikke være negativ");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + alcoholPercentage + "%  - " + price + "kr.";
    }

}
