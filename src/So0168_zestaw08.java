public class So0168_zestaw08 {

    public static void main(String[] args) {
        // cwiczenie I

        MethodCurrier methodCurrier = new MethodCurrier(123);

        int intVal = 168;
        double doubleVal = 16.8;
        char chVal = 66;
        byte byteVal = 123;
        methodCurrier.setValue(doubleVal);
        methodCurrier.setValue(intVal);
        methodCurrier.setValue(chVal);
        methodCurrier.setValue(byteVal);
        /* przeciążona metoda setValue zostanie przez kompilator wybrana jeśli jest w stanie
           obsłużyć typ przyjmowany w argumencie. Na przykład typ zmiennoprzecinkowy w argumencie
           typu double.

         */

        // cwiczenie II
        Number number = new Number(77);
        number.setX(88);
        number.showX();

        methodCurrier.setX(111);
        methodCurrier.showX();

        //cwiczenie III
        Persona persona=new Persona();
        persona.imie="tomek";
        persona.nazwisko="tatar";
        persona.wiek=33;

        Osoba osoba = new Osoba("Janusz", "Kowalski", 47);
        //cwiczenie IV
        osoba.show();
        //cwiczenie V
        Cplx cplx = new Cplx(5, +2);
        Cplx cplx2 = new Cplx(3, -7);

        Cplx cplx3 = new Cplx(4, 7);
        Cplx cplx4 = new Cplx(3, 6);

        Cplx cplx5 = new Cplx( 1,-3);
        Cplx cplx6 = new Cplx( 2,5);
        Cplx mulResult=new Cplx(0,0);
        Cplx cplx8 = new Cplx( 2,8);
        Cplx cplx9 = new Cplx( 3,2);
        Cplx cplx10 = new Cplx( 1,-4);
        Cplx cplx11 = new Cplx( 2,3);



        cplx.show();
        cplx2.show();
        cplx.add(cplx2);
        cplx.show();
        cplx.inc(cplx);
        cplx.show();

        cplx3.sub(cplx4);
        cplx3.show();

        cplx5.show();
        cplx6.show();
        mulResult=cplx5.mul(cplx6);
        mulResult.show();
        cplx8.show();
        cplx9.show();
        mulResult=cplx8.mul(cplx9);
        mulResult.show();
        cplx10.show();
        cplx11.show();
        mulResult=cplx10.mul(cplx11);
        mulResult.show();

    }

    public static class MethodCurrier extends Number {

        private int x;
        public MethodCurrier(int x) {
         super(x);
        }

        public void setValue(int x) {
            System.out.println(x);
        }

        public void setValue(double x) {
            System.out.println(x);
        }

    }

    public static class Number {
        private int x;

        public Number(int x) {
            this.x = x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void showX() {
            System.out.println(x);
        }
    }

    public static class Persona{
        String imie;
        String nazwisko;
        int wiek;
    }
    public static class Osoba {
        public String imie;
        public String nazwisko;
        public int rokUrodzenia;

        public Osoba(String imie, String nazwisko, int rokUrodzenia) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.rokUrodzenia = rokUrodzenia;

        }

        public void show() {
            System.out.println("imię   \t: " + imie);
            System.out.println("nazwisko: " + nazwisko);
            System.out.println("rok ur. : " + rokUrodzenia);
        }

    }

    public static class Cplx {

        private double re;
        private double im;

        Cplx(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public Cplx add(Cplx zesp) {
            Cplx wynik = new Cplx(re, im);
            this.re += zesp.re;
            this.im += zesp.im;

            return wynik;
        }

        public Cplx sub(Cplx zesp) {
            Cplx wynik = new Cplx(re, im);
            this.re -= zesp.re;
            this.im -= zesp.im;

            return wynik;
        }
        public Cplx mul(Cplx zesp) {
            Cplx result = new Cplx(re, im);
         result.re=(this.re*zesp.re)-(this.im*zesp.im);
         result.im=(this.re*zesp.im)+(this.im*zesp.re);

            return result;
        }

        public void inc(Cplx zesp) {
            zesp.re += 1;
        }

        void show() {
            char znak = '+';
            if (im < 0) znak = ' ';
            System.out.println((int) re + "" + znak + "" + (int) im + "i");
        }


    }
}
