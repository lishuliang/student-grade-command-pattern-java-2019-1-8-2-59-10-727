package com.tw;


public class Student {
    private String sname;//姓名
    private int sno; //学号
    private Grade grade;//成绩

    private String snation;//名族
    private int sclass;//班级

    public Student() {}

    public Student(int sno, String sname, Grade grade){
        this.sno = sno;
        this.sname = sname;
        this.grade = grade;
    }

    public int getSno() {
        return this.sno;
    }

    public String getSname() {
        return this.sname;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public int getSclass() {
        return sclass;
    }

    public String getSnation() {
        return snation;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setSclass(int sclass) {
        this.sclass = sclass;
    }

    public void setSnation(String snation) {
        this.snation = snation;
    }
}
