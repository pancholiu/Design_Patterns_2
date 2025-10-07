package flyweight.excercise;

public class FontFeature {
    private final FeatureType featureType;

    public FontFeature(FeatureType featureType) {
        this.featureType = featureType;
    }

    public FeatureType getFeatureType() {
        return featureType;
    }
}
