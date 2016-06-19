package jam;
public class Jam {
int hh, mm, dd;

    public Jam() {
    }


    public Jam(int hh, int mm, int dd) {
        this.hh = hh;
        this.mm = mm;
        this.dd = dd;
    }

int convertJamtoMenit(int jam){
    int menit;
    menit = jam * 60;
    return menit;
}     
int convertJamtoDetik(int jam){
    int detik;
    detik = jam * 3600;
    return detik;
}
int convertDaytoJam(int day){
    day = day * 24;
    return day;
}
int convertMonthtoJam(int month){
    int jam = 24  ;
    int day = 30;
    month = jam * day;
    return month;
}
double convertMonthtoYear(double year){
    double month = 1;
    
    year = 12 / month;
    return year;
}
int convertYeartoJam(int jam){
    int year = 12;
    jam = year * 720;
return jam;    
}
int convertWindutoJam(int jam){
    int windu=8;
    jam = windu * 720;
    return jam;
}

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }
     
    
}
