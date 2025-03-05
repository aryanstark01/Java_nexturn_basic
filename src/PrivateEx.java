public class PrivateEx {
    private final int secretCode=561;
    void showCode(){
        System.out.println("Private Data:"+secretCode);
    }
    public static void main(String[] args){
        PrivateEx obj= new PrivateEx();
        obj.showCode();
    }
}

