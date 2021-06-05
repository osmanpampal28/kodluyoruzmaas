public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double vergi;
    double bonus;
    double maasartis;

    public Employee(String name,double salary,double workHours,int hireYear){
        this.name=name;
        if(salary<0)
            this.salary=0;
        else
            this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.vergi=0;
        this.bonus=0;
        this.maasartis=0;
    }
    public void tax(){
        if(this.salary>1000){
            this.vergi=(this.salary*3)/100;
        }else
            this.vergi=0;
    }
    public void bonus(){
        this.bonus=150;
    }
    public void raiseSalary(){
        int now=2021;
        if(now-this.hireYear<10){
            double artis=this.salary/20;
            this.maasartis+=artis;
        }
        else if(now-hireYear>=100 && now-hireYear<20){
            double artis=this.salary/10;
            this.maasartis+=artis;
        }
        else{
            double artis=(this.salary*15)/100;
            this.maasartis+=artis;
        }
    }

    @Override
    public String toString() {
        return "Adı : "+this.name+
                "\nMaaşı : "+this.salary+
                "\nÇalışma Saati : "+this.workHours+
                "\nBaşlangıç Yılı : "+this.hireYear+
                "\nVergi : "+this.vergi+
                "\nBonus : "+this.bonus+
                "\nMaaş Artışı : "+maasartis+
                "\nVergi ve bonuslar ile birlikte toplam maaş : "+(this.salary-this.vergi+this.bonus)+
                "\nToplam Maaş : "+(this.salary+this.maasartis);
    }
}
