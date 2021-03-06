package dev.eliorba.insulinbook1.Models;

public class Food {
    private String title="";
    private  int Sugarbefore = 0;
    private  int Sugarafter = 0;
    private  int InsulinDose = 0;
    private int LongInsulin = 0 ;

    public int getLongInsulin() {
        return LongInsulin;
    }

    public Food setLongInsulin(int longInsulin) {
        LongInsulin = longInsulin;
        return this;
    }

    private  int Wight = 0;
    private  int Hight = 0;
    private String UserName = null;
    private String Image = null;


    public Food() {
    }

    public String getTitle() {
        return title;
    }

    public String getUserName() {
        return UserName;
    }

    public Food setUserName(String userName) {
        UserName = userName;
        return this;
    }

    public Food setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getSugarBefore() {
        return Sugarbefore;
    }

    public Food setSugarBefore(int sugarBefore) {
        this.Sugarbefore = sugarBefore;
        return this;
    }

    public int getSugarAfter() {
        return Sugarafter;
    }

    public Food setSugarAfter(int Sugarafter) {
        this.Sugarafter = Sugarafter;
        return this;
    }

    public int getInsulinDose() {
        return InsulinDose;
    }

    public Food setInsulinDose(int insulinDose) {
        InsulinDose = insulinDose;
        return this;
    }

    public int getWight() {
        return Wight;
    }

    public Food setWight(int wight) {
        this.Wight = wight;
        return this;
    }

    public int getHight() {
        return Hight;
    }

    public Food setHight(int hight) {
        this.Hight = hight;
        return this;
    }

    public String getImage(){
        return Image;
    }

    public void setImage(String imageUrl){
        Image = imageUrl;
    }
}
