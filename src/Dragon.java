public class Dragon {

    private String name;
    private String breed;
    private String color;
    private int age;
    private boolean bonded;

    public Dragon() {
        this(null, null, null, 0, false);
    }

    public Dragon(final String theName, final String theBreed, final String theColor, final int theAge, final boolean theBonded) {
        setName(theName);
        setBreed(theBreed);
        setColor(theColor);
        setAge(theAge);
        setBonded(theBonded);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean isBonded() {
        return bonded;
    }

    public void setName(final String theName) {
        name = theName;
    }

    public void setBreed(final String theBreed) {
        breed = theBreed;
    }

    public void setColor(final String theColor) {
        color = theColor;
    }

    public void setAge(final int theAge) {
        age = theAge;
    }

    public void setBonded(final boolean theBonded) {
        bonded = theBonded;
    }
}
