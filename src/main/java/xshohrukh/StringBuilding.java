package xshohrukh;

public class StringBuilding {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 100; i++) {
//            str = str + i;
//        }
//        System.out.println(str);
        //class name
        StringBuilder stringBuilder = new StringBuilder();

        for ( int i = 0; i < 100; i++ ) {
            //stringBuilder.append(i);
            stringBuilder.insert(0, i);
        }

        String str = stringBuilder.toString();
        System.out.println(str);
    }
}