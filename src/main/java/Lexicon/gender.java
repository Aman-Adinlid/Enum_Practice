package Lexicon;

public enum gender {

    MALE(0),FEMALE(1);

    private int GenderNumber;

    gender(int genderNumber) {
        GenderNumber = genderNumber;
    }

    public int getGenderNumber() {
        return GenderNumber;
    }

    public void setGenderNumber(int genderNumber) {
        GenderNumber = genderNumber;
    }
}
