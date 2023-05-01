abstract class Beverage {
    protected String size;
    protected boolean whippedCream;
    protected String name;
    

    public Beverage(String size) {
        this.name = name;
        this.size = size;
        this.whippedCream = false;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public abstract int getPrice();
}

class Coffee extends Beverage {
    protected String type;
    protected boolean bubbles;

    public Coffee(String type, String size) {
        super(size);
        this.type = type;
        this.bubbles = false;
    }

    public void setBubbles(boolean bubbles) {
        this.bubbles = bubbles;
    }

    public int getPrice() {
        int price = 0;

        if (type.equalsIgnoreCase("1")) {
            if (size.equalsIgnoreCase("s")) {
                price = 50;
            } else if (size.equalsIgnoreCase("m")) {
                price = 65;
            } else if (size.equalsIgnoreCase("l")) {
                price = 80;
            } 
        } else if (type.equalsIgnoreCase("2")) {
            if (size.equalsIgnoreCase("s")) {
                price = 55;
            } else if (size.equalsIgnoreCase("m")) {
                price = 70;
            } else if (size.equalsIgnoreCase("l")) {
                price = 85;
            }
        }
            

        if (whippedCream) {
            price += 10;
        }

        if (bubbles) {
            price += 10;
        }

        return price;
    }
}

class Tea extends Beverage {
    protected String type;
    protected boolean pearls;

    public Tea(String type, String size) {
        super(size);
        this.type = type;
        this.pearls = false;
    }

    public void setPearls(boolean pearls) {
        this.pearls = pearls;
    }

    public int getPrice() {
        int price = 0;

        if (type.equalsIgnoreCase("2")) {
            if (size.equalsIgnoreCase("s")) {
                price = 35;
            } else if (size.equalsIgnoreCase("m")) {
                price = 45;
            } else if (size.equalsIgnoreCase("l")) {
                price = 55;
            }
        } else if (type.equalsIgnoreCase("1")) {
            if (size.equalsIgnoreCase("s")) {
                price = 40;
            } else if (size.equalsIgnoreCase("m")) {
                price = 50;
            } else if (size.equalsIgnoreCase("l")) {
                price = 60;
            }
        }

        if (whippedCream) {
            price += 10;
        }

        if (pearls) {
            price += 15;
        }

        return price;
    }
}
