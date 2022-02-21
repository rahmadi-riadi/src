package konversi_suhu;

public class Konversi {
    double suhu_awal;

    public Konversi(double suhu_awal){
        this.suhu_awal=suhu_awal;

    }
    public double R(){
        return(4*suhu_awal)/5;
    }
    public double F(){
        return(9*suhu_awal)/5+32;
    }
    public double K(){
        return(suhu_awal+273.15);
    }
}


