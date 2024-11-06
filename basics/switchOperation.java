class switchOperation{
    public static void main(String[] args) {
        int number=2;
        switch(number){
            case 1: System.err.println("one");
                    break;
            case 2: System.out.println("two");
                    break;
            default: System.out.println("no number ");
        }
        System.err.println("this is for err testing");
    }
}