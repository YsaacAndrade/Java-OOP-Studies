import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String ysaac = "{\n" + '"'+"name"+'"'+" : "+"Ysaac"+",\n"+'"'+"age"+'"'+" : "+"19"+",\n"+'"'+"city"+'"'+" : "+"SJBV"+"\n}";
        Pessoa pessoa = gson.fromJson(ysaac, Pessoa.class);
        System.out.println(pessoa);
    }
}