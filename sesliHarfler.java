public class sesliHarfler {

    public static void main(String[] args) {

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'U':
            case 'O':
            case 'I':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");

        }
    }
}