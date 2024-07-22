public abstract class CompanyRoditel implements PriemNaWork {
    private int predlogZp;
    private int ojidYear;
    private int ojidStaj;

    public CompanyRoditel(int predlogZp, int ojidYear, int ojidStaj) {
        this.predlogZp = predlogZp;
        this.ojidYear = ojidYear;
        this.ojidStaj = ojidStaj;
    }

    public int getPredlogZp() {
        return predlogZp;
    }

    public void setPredlogZp(int predlogZp) {
        this.predlogZp = predlogZp;
    }

    public int getOjidYear() {
        return ojidYear;
    }

    public void setOjidYear(int ojidYear) {
        this.ojidYear = ojidYear;
    }

    public int getOjidStaj() {
        return ojidStaj;
    }

    public void setOjidStaj(int ojidStaj) {
        this.ojidStaj = ojidStaj;
    }
    public abstract void workCompany();

    public abstract void PiemWork(Employee employee);

}
