public class Box <T,K> {
    private T boxWeight;
    private K boxProduction;

    public Box(T boxWeight, K boxProduction) {
        this.boxWeight = boxWeight;
        this.boxProduction = boxProduction;
    }

    public T getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(T boxWeight) {
        this.boxWeight = boxWeight;
    }

    public K getBoxProduction() {
        return boxProduction;
    }

    public void setBoxProduction(K boxProduction) {
        this.boxProduction = boxProduction;
    }

    static <T> void method(T box1) {
        System.out.println("Box quantity: "+box1);
    }

    @Override
    public String toString() {
        return "Box: " +
                "boxWeight: " + boxWeight +"\n"+
                "boxProduction: " + boxProduction ;
    }
}

