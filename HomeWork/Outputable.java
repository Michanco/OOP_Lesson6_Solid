public interface Outputable  {
    static void outSave(String string) {
        System.out.println("Save user: " + string);
    }

    static void outReport(String string){
        System.out.println("Report for user: " + string);
    }

}
