abstract class Bakery {
    public abstract Dessert bakeDessert();

    public void makeDessert() {
        Dessert d = bakeDessert();
        d.bake();
    }
}
