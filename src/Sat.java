class Sat {
    static int sati,minute,sekunde;
    Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
    void Postavi(int sati, int minute, int sekunde) { Sat.sati=sati; Sat.minute=minute; Sat.sekunde=sekunde; }
    void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<-pomak; i++) Prethodni();
    }
    static int DajSate() { return sati; }
    static int DajMinute() { return minute; }
    static int DajSekunde() { return sekunde; }
    static void Ispisi() { System.out.println(sati + ":" + minute + ":" + sekunde); }
};