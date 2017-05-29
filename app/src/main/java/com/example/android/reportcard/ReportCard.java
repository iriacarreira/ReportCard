package com.example.android.reportcard;

/**
 * Created by Iria on 29/05/2017.
 */


public class ReportCard {


    private String mNameStudent;

    private int mYearStudent;

    private double mMarkMaths;

    private double mMarkEnglish;

    private double mMarkHistory;

    private double mMarkGeography;

    private double mMarkCitizenship;


    public ReportCard(String Name, int Year, double Maths, double English, double History, double Geography, double Citizenship) {

        mNameStudent = Name;
        mYearStudent = Year;
        mMarkMaths = Maths;
        mMarkEnglish = English;
        mMarkHistory = History;
        mMarkGeography = Geography;
        mMarkCitizenship = Citizenship;


    }

    public String getmNameStudent() {
        return mNameStudent;
    }

    public void setmNameStudent(String Name) {
        mNameStudent = Name;
    }

    public int getmYearStudent() {
        return mYearStudent;
    }

    public void setmYearStudent(int Year) {
        mYearStudent = Year;
    }

    public double getmMarkMaths() {
        return mMarkMaths;
    }

    public void setmMarkMaths(double Maths) {
        mMarkMaths = Maths;
    }

    public double getmMarkEnglish() {
        return mMarkEnglish;
    }

    public void setmMarkEnglish(double English) {
        mMarkEnglish = English;
    }

    public double getmMarkHistory() {
        return mMarkHistory;
    }

    public void setmMarkHistory(double History) {
        mMarkHistory = History;
    }

    public double getmMarkGeography() {
        return mMarkGeography;
    }

    public void setmMarkGeography(double Geography) {
        mMarkGeography = Geography;
    }

    public double getmMarkCitizenship() {
        return mMarkCitizenship;
    }

    public void setmMarkCitizenship(double Citizenship) {
        mMarkCitizenship = Citizenship;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "\nName: " + mNameStudent +
                "\nYear: " + mYearStudent +
                "\nMark in Mathematics: " + mMarkMaths +
                "\nMark in English: " + mMarkEnglish +
                "\nMark in History: " + mMarkHistory +
                "\nMark in Geography:" + mMarkGeography +
                "\nMark in Citizenship:" + mMarkCitizenship +
                " }";

    }


}

