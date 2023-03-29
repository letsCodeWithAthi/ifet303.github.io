public class gs{
    public int g(int a){
        if(a<9){
            return 9;
        }
        if(a<7){
            return 7;
        }
        if(a<4){
            return 4;
        }
        return 0;
    }
    public static void main(String[] args){
        gs obj = new gs();
        System.out.println(obj.g(5));
    }
}