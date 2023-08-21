package javaSE;

public enum _09_Enum {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class EnumExample {
    public static void main(String[] args) {
        String data = _09_Enum.SUNDAY.toString();
        System.out.println(data);
        System.out.println(_09_Enum.SUNDAY.name());
        System.out.println(_09_Enum.SUNDAY.ordinal());
    }
}