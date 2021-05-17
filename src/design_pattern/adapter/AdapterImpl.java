package design_pattern.adapter;

public class AdapterImpl implements Adapter{

    @Override
    public Float twice(Float f) {
        return (float)Math.twoTime(f.doubleValue());
    }

    @Override
    public Float half(Float f) {
        System.out.println("half 로그");
        return (float)Math.half(f.doubleValue());
    }
}
