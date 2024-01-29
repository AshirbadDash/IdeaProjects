class Pizza {
    // constructor
    public Pizza() {
        System.out.println("Making a basic pizza");

    }

}

class PepperoniPizza  extends Pizza{
    // constructor
    public PepperoniPizza() {
        System.out.println("Adding pepperoni on top");

    }

    public static class TestPizza {
        public static void main(String[] args) {
            PepperoniPizza pizza = new PepperoniPizza();

        }
    }

}
