public class Main {

    public static void main(String[] args) throws MINarray.ExeArrayVuoto {
	
       MINarray array = new MINarray();
       array.setArray();
       int min = array.primoMinore();
       int ndMin = array.secondNum();
       System.out.println(min + " è il minore " + ndMin + " è il secondo minore");
    }
}
